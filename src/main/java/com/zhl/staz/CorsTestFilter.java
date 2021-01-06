package com.zhl.staz;

import org.springframework.http.HttpHeaders;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description: 在filter层处理跨域请求  spring 4.2之后本身提供了支持CORS的API
 * https://fangshixiang.blog.csdn.net/article/details/100999550
 * @author: zhanghailang
 * @date: 2021-1-6 15:50
 */
public class CorsTestFilter extends HttpFilter {

    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.addHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,"*");
        servletResponse.addHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS,"*");
        servletResponse.addHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,"*");
        servletResponse.addHeader(HttpHeaders.ACCESS_CONTROL_MAX_AGE,"5");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}