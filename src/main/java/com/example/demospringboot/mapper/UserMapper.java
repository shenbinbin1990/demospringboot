package com.example.demospringboot.mapper;

import com.example.demospringboot.entity.TbUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public TbUser selectByPrimaryKey(Long id);
}
