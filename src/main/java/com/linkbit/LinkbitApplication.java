package com.linkbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 2016年10月25日 系统入口
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class LinkbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkbitApplication.class, args);
    }
}
