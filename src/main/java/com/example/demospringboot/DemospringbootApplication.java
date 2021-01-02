package com.example.demospringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@MapperScan("com.example.demospringboot.mapper")
@SpringBootApplication
@ComponentScan("com.example.demospringboot")
public class DemospringbootApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("12345");
    }



}
