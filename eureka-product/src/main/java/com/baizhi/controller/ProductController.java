package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
    @RequestMapping("product")
    public String getProduct(String name,String password,Integer age){

        return "hello 1节点"+name+" "+password+" "+age;
    }
}
