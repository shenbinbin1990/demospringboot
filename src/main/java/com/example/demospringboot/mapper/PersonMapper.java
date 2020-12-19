package com.example.demospringboot.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demospringboot.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper extends BaseMapper<Person> {

}
