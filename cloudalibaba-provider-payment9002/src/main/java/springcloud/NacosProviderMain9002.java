package com.tutu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tutu 2020/5/23 10:31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderMain9001.class, args);
    }
}
