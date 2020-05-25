package com.tutu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tutu 2020/5/21 9:13
 */
@RestController
@RequestMapping("/consumer/payment")
@Slf4j
public class OrderController {

    //public static final String INVOKE_URL = "http://cloud-provider-payment";
    public static final String INVOKE_URL = "http://localhost:8004";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/zk")
    public String paymentInfo() {
        log.info("/consumer/payment/zk");
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }

}
