package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * SpringBoot核心注解
 *  1. @Configuration
 *  2. @SpringBootConfiguration 使用@SpringBootConfiguration 标注的类就是一个配置类
 *  3. @EnableAutoConfiguration
 *  4. @ComponentScan
 */
// springboot 入口注解
@SpringBootApplication
public class MyApplication {
    // 配置类中是可以配置bean的， 并且自动纳入IOC容器的管理
    @Bean
    public Date date() {
        return new Date();
    }

    public static void main(String[] args) {
        // 代码固定， 启动容器
        SpringApplication.run(MyApplication.class, args);
    }
}
