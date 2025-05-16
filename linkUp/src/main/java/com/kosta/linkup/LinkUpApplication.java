package com.kosta.linkup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LinkUpApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LinkUpApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LinkUpApplication.class);
    }

}
