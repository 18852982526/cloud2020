package com.tutu.springcloud.service;

import com.tutu.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tutu 2020/5/24 15:34
 */
@FeignClient("seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/decrease")
    CommonResult<?> decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
