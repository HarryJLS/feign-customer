package com.cloud.feigncustomer.Conraoller;


import com.cloud.feigncustomer.feign.GetFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 控制层
@RestController
public class TestController {

    @Autowired
    private GetFeign getFeign;

    @RequestMapping (value = "/shishikan")
    public String test(){
        return getFeign.TV();
    }
}
