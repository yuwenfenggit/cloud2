package com.example.eurekaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix  //开启熔断支持
@EnableHystrixDashboard
public class EurekaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaWebApplication.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplat(){
        return new RestTemplate();
    }

}
