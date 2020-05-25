package com.tutu.springcloud.service;

import com.tutu.springcloud.domain.Order;

/**
 * @author tutu 2020/5/24 15:31
 */

public interface OrderService {

    void create(Order order);

    void update();
}
