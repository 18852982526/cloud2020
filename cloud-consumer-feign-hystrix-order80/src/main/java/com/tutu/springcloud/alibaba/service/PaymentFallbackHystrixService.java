package com.tutu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author tutu 2020/5/22 12:37
 */
@Component
public class PaymentFallbackHystrixService implements PaymentHystrixService{

    @Override
    public String paymentInfoOk(Integer id) {
        return "-------PaymentFallbackHystrixService-------";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-------paymentInfoTimeOut-------";
    }
}
