package com.zhl.staz.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description: 全局的web形式的配置  WebMvcConfigurerAdapter    /     WebMvcConfigurer的使用详解
 * @author: zhanghailang
 * @date: 2021-1-6 19:34
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/test/cors")
                .allowedOrigins("http://localhost:63342")
                .maxAge(5);
//        registry.addMapping("/**").allowedOrigins("*");

    }
}