package com.tutu.springcloud.service;

import com.tutu.springcloud.entities.Payment;

/**
 * @author tutu 2020/5/20 17:05
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
