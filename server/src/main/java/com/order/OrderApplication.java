package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.imooc")
//@SpringBootApplication
//@EnableDiscoveryClient
////@EnableCircuitBreaker
//@SpringBootApplication
//@EnableCircuitBreaker
//@ComponentScan(basePackages = "com.imooc")
@SpringCloudApplication
@EnableHystrixDashboard
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
