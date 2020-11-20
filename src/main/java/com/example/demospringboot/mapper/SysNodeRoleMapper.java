package com.example.demospringboot.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysNodeRoleMapper {
    List<String> selectSysNodeCodeListByRoleId(String roleId);
}