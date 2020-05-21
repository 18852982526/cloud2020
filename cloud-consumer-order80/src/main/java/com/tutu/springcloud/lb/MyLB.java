package com.tutu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tutu 2020/5/21 17:07
 */
@Component
public class MyLB implements LoadBalancer{



    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        return null;
    }

}
