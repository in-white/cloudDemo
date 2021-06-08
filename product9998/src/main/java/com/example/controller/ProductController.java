package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {
    @Value("${server.port}")
    private int port;
    @GetMapping("/product/showMsg")
    public String showMsg(){
        log.info("进入商品服务，展示商品信息");
        return "进入商品服务，展示商品信息，当前服务端口为："+port;
    }
}
