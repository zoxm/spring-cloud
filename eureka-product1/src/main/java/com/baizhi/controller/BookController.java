package com.baizhi.controller;

import com.baizhi.entity.Book;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {,
    @RequestMapping("book")
    public String getBook(String name){

        return "hello 2节点"+name;
    }
    @RequestMapping("book1")
    public String getBook1(String name,String password){

        return "hello 2节点"+name+password;
    }
    @RequestMapping("book2")
    public Book getBook2(@RequestBody Book book){
        book.setName("盗墓笔记");

        return book;
    }
}
