package com.swb.ssm.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.swb.ssm.service.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
