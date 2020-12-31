package com.wujie.springcloud.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.wujie.springcloud.member.dao")
@EnableFeignClients(basePackages = "com.wujie.springcloud.member.feign")
@EnableDiscoveryClient
public class SpringcloudMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMemberApplication.class, args);
    }

}
