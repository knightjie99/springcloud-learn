package com.wujie.springcloud.channel;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wujie.springcloud.channel.dao")
public class SpringcloudChannelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudChannelApplication.class,args);
    }

}
