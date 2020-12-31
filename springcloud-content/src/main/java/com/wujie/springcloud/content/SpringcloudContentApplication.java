package com.wujie.springcloud.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.wujie.springcloud.content.dao")
@EnableDiscoveryClient
public class SpringcloudContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudContentApplication.class, args);
    }

}
