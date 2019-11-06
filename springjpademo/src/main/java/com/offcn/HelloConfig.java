package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.offcn.mapper")
public class HelloConfig {

    public static void main(String[] args) {
        SpringApplication.run(HelloConfig.class,args);
    }
}
