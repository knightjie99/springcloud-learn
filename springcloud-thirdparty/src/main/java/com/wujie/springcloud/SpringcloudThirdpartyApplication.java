package com.wujie.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudThirdpartyApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudThirdpartyApplication.class, args);
    }
}
