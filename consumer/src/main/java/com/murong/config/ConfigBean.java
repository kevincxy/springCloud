package com.murong.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author changxiangyang
 * @createTime 2019/8/13 11:39
 * @description
 **/
@Configuration
public class ConfigBean {
    public static final Logger log = LoggerFactory.getLogger(ConfigBean.class);
    @Bean
    @LoadBalanced //Spring Cloud Ribbon 是基于Netflix Ribbon实现的一套客户端负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
