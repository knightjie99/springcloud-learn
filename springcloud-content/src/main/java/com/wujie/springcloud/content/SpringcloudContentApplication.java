package com.wujie.springcloud.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wujie.springcloud.content.dao")
public class SpringcloudContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudContentApplication.class, args);
    }

}
