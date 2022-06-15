package com.cloud.feigncustomer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "feign-test")
public interface GetFeign {


    @PostMapping(value = "/test")
    public String TV();



}
