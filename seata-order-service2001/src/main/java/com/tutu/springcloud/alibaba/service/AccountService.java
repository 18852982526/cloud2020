package com.tutu.springcloud.service;

import com.tutu.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author tutu 2020/5/24 15:34
 */
@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    CommonResult<?> decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
