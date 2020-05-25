package com.tutu.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author tutu 2020/5/21 22:38
 */
public interface PaymentService {

    String paymentInfoOk(Integer id);

    String paymentInfoTimeOut(Integer id);

    String paymentCircuitBreaker(Integer id);

}
