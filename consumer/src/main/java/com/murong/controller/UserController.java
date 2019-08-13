package com.murong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author changxiangyang
 * @createTime 2019/8/13 11:32
 * @description
 **/
@RestController
public class UserController {
    public static final Logger log = LoggerFactory.getLogger(UserController.class);
//    private static final String REST_URL_PREFIX = "http:localhost:8001";
    private static final String REST_URL_PREFIX = "http:PROVIDER-SERVER";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getUserNum")
    @ResponseBody
    public String getUserNum(){
        String str = restTemplate.getForObject(REST_URL_PREFIX+"/getUserNum",String.class);
        return "你是好妈妈！";
    }
}
