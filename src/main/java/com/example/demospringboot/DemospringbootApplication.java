package com.example.demospringboot;

import com.example.demospringboot.entity.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
    }
    public void myTeacher(){
        Teacher t = new Teacher();

    }
}
