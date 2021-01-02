package com.example.demospringboot;

import com.example.demospringboot.mapper.PersonMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@MapperScan("com.example.demospringboot.mapper")
@SpringBootApplication
//@ComponentScan("com.example.demospringboot")
//public class DemospringbootApplication implements ApplicationRunner {
public class DemospringbootApplication  {
    @Autowired
    private PersonMapper personMapper;
    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
        System.out.println("12345");
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("12345");
////        List<Person> personList = personMapper.selectList(null);
////        System.out.println("12345");
//    }



}
