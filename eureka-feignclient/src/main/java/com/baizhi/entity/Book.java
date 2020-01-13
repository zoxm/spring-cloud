package com.baizhi.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String desc;
    private Integer price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(String name, String desc, Integer price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
}
