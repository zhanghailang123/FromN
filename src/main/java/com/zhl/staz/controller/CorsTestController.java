package com.zhl.staz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @description: 简单请求跨域测试
 * @author: zhanghailang
 * @date: 2021/1/4 0004 23:15
 */
@RestController
public class CorsTestController {
    @GetMapping("/test/cors")
    public Object testCors(HttpServletResponse response) {
        System.out.println("111111");
        // HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN
//        response.addHeader("Access-Control-Allow-Origin", "http://localhost:63342");
        return "hello cors";
    }
}
