package com.baizhi.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("test")
    public String test(String name,String password,Integer age){
        //java 中发送http请求  。java  httpclient
        //String forObject = restTemplate.getForObject("http://EUREKA-PRODUCT/product/product?name=" + name, String.class);
        /*ServiceInstance instance = loadBalancerClient.choose("EUREKA-PRODUCT");
        String host = instance.getHost();
        int port = instance.getPort();
        String serviceId = instance.getServiceId();*/
        Map<String,Object> map=new HashMap<>();
        map.put("name",name);
        map.put("password",password);
        map.put("age",age);

        String forObject = restTemplate.getForObject("http://EUREKA-PRODUCT/product/product?name={name}&password={password}&age={age}", String.class,map);
        return forObject;

    }

    public String fallback(String name,String password,Integer age){

        return "product is down!!!!";
    }

}
