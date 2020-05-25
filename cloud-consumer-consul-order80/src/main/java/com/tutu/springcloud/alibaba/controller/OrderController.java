package com.tutu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tutu 2020/5/21 11:41
 */
@RestController
@Slf4j
public class OrderController {

    //public static final String INVOKE_URL = "http://consul-provider-payment";
    public static final String INVOKE_URL = "http://localhost:8006";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo() {
        log.info("/consumer/payment/consul");
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }

}
