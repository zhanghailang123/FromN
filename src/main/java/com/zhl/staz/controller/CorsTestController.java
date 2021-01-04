package com.zhl.staz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 跨域测试
 * @author: zhanghailang
 * @date: 2021/1/4 0004 23:15
 */
public class CorsTestController {
    @RestController
    public class CorsController {

        @GetMapping("/test/cors")
        public Object testCors() {
            return "hello cors";
        }
    }
}