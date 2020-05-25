package com.tutu.springcloud.service.impl;

import com.tutu.springcloud.dao.OrderDao;
import com.tutu.springcloud.domain.Order;
import com.tutu.springcloud.service.AccountService;
import com.tutu.springcloud.service.OrderService;
import com.tutu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author tutu 2020/5/24 15:31
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    public void create(Order order) {
        log.info("------------->开始创建订单");
        orderDao.create(order);
        log.info("------------->订单微服务调用库存微服务进行扣除库存count start:");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------------->订单微服务调用库存微服务进行扣除库存count end");
        log.info("------------->订单微服务调用账户微服务进行扣除金额money start:");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------------->订单微服务调用账户微服务进行扣除金额money end");

        log.info("------------->更新订单状态 start:");

    }
}
