package com.tutu.springcloud.controller;

import com.tutu.springcloud.entities.CommonResult;
import com.tutu.springcloud.entities.Payment;
import com.tutu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author tutu 2020/5/20 17:08
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult<Integer> create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入成功", result);
        } else {
            return new CommonResult<>(444, "插入失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("插入结果：" + result);
        if (result == null) {
            return new CommonResult<>(400, "没有对应记录,id:" + id, null);
        } else {
            return new CommonResult<>(200, "success", result);
        }
    }
}
