package com.wujie.springcloud.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.wujie.springcloud.study.dao")
@EnableFeignClients
@EnableDiscoveryClient
public class SpringcloudStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyApplication.class, args);
    }

}
