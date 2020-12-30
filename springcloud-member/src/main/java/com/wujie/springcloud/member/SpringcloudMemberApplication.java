package com.wujie.springcloud.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wujie.springcloud.member.dao")
public class SpringcloudMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMemberApplication.class, args);
    }

}
