package com.wujie.springcloud.question;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wujie.springcloud.question.dao")
@SpringBootApplication
public class SpringcloudQuestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudQuestionApplication.class,args);
    }

}
