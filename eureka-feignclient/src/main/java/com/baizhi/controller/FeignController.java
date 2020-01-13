package com.baizhi.controller;

import com.baizhi.entity.Book;
import com.baizhi.feign.FeignTest1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class FeignController {
    @Autowired
    private FeignTest1 feignTest1;

    @RequestMapping("feign")
    public String testFeign(String name){
        String test = feignTest1.test(name);
        return test;
    }
    @RequestMapping("feign1")
    public String testFeign(String name,String password){
        String s = feignTest1.test1(name, password);
        return s;
    }
    @RequestMapping("feign2")
    public Book testFeign2(){
        Book book = new Book("沙海", "吴邪", 12);
        Book book1 = feignTest1.test2(book);
        return book1;
    }

}
