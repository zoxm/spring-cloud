package com.baizhi.feign;

import com.baizhi.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrix implements FeignTest1 {
    @Override
    public String test(String aa) {

        return "product is down!!!!";
    }

    @Override
    public String test1(String name, String password) {
        return null;
    }

    @Override
    public Book test2(Book book) {
        return null;
    }
}
