package com.murong.eurakeserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(EurakeServer02Application.class, args);
    }

}
