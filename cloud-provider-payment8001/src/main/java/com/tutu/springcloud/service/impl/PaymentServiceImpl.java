package com.tutu.springcloud.service.impl;

import com.tutu.springcloud.dao.PaymentDao;
import com.tutu.springcloud.entities.Payment;
import com.tutu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author tutu 2020/5/20 17:06
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
