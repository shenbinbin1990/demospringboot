package com.example.demospringboot;

import com.example.demospringboot.entity.Person;
import com.example.demospringboot.mapper.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemospringbootApplicationTests {
    @Autowired
    private PersonMapper personMapper;
    @Test
    void contextLoads() {
        personMapper.insert(Person.builder().build());
    }

}
