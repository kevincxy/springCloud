package com.murong.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author changxiangyang
 * @createTime 2019/8/9 11:59
 * @description
 **/
@RestController
public class UserController {
    public static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private DiscoveryClient client;
    @GetMapping("/discovery")
    public Object discovery(){

        List<String> list =client.getServices();
        System.out.println("******"+list);
        List<ServiceInstance> srvList = client.getInstances("provider-server");
        for(ServiceInstance element :srvList){
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }
        return this.client;
    }
    @GetMapping("/getUserNum")
    public String getUserNum(){
        return "用户个数有5个";
    }
}
