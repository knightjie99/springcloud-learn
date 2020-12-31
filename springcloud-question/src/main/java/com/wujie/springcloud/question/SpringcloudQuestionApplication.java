package com.wujie.springcloud.question;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.wujie.springcloud.question.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudQuestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudQuestionApplication.class,args);
    }

}
