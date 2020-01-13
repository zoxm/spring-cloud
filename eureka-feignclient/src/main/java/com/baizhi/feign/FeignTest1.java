package com.baizhi.feign;

import com.baizhi.entity.Book;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "EUREKA-PRODUCT",fallback = FeignHystrix.class)
public interface FeignTest1 {
    @RequestMapping("/book/book")
    public String test(@RequestParam("name") String aa);
    @RequestMapping("/book/book1")
    public String test1(@RequestParam("name") String name,@RequestParam("password") String password);
    @RequestMapping("/book/book2")
    public Book test2(Book book);
}
