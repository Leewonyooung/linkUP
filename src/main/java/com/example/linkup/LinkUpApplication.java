package com.example.linkup;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LinkUpApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/servlet-context.xml");
    }
}