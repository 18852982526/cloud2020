package com.tutu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tutu 2020/5/23 10:53
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String server_url;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/nacos/{id}")
    public String getPaymentInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(server_url + "/payment/nacos/" + id, String.class);
    }

}
