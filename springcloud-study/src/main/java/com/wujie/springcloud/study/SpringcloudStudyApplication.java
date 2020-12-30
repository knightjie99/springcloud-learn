package com.wujie.springcloud.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wujie.springcloud.study.dao")
public class SpringcloudStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyApplication.class, args);
    }

}
