package com.zhl.staz.config;

import com.zhl.staz.CorsTestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 过滤器配置
 * @author: zhanghailang
 * @date: 2021-1-6 16:05
 */
@Configuration
public class FiterConfig {
    @Bean
    public FilterRegistrationBean<CorsTestFilter> filters(){
        FilterRegistrationBean<CorsTestFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CorsTestFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("corstest");
        return registrationBean;
    }
}