package com.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 15:05 2020/3/7
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
@RequestMapping("/order111")
public class HystrixController {

    //超时配置
//	@HystrixCommand(commandProperties = {
//			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//	})

    //	@HystrixCommand(commandProperties = {
//			@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  				//设置熔断
//			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),	//请求数达到后才计算
//			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗
//			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),	//错误率
//	})
    @HystrixCommand
    @GetMapping("/getProductInfoList")
    public String getProductInfoList(@RequestParam("number") Integer number) {
        if (number % 2 == 0) {
            return "success";
        }

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://127.0.0.1:8080    /product/listForOrder",
                Arrays.asList("157875196366160022"),
                String.class);

//		throw new RuntimeException("发送异常了");
    }

    private String fallback() {
        return "太拥挤了, 请稍后再试~~";
    }

    private String defaultFallback() {
        return "默认提示：太拥挤了, 请稍后再试~~";
    }
}
