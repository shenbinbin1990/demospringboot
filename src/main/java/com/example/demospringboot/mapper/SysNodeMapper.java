package com.example.demospringboot.mapper;

import com.example.demospringboot.entity.SysNode;
import com.example.demospringboot.entity.SysNodeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysNodeMapper {
    int countByExample(SysNodeExample example);

    int deleteByExample(SysNodeExample example);

    int deleteByPrimaryKey(String nodeId);

    int insert(SysNode record);

    int insertSelective(SysNode record);

    List<SysNode> selectByExample(SysNodeExample example);

    SysNode selectByPrimaryKey(String nodeId);

    int updateByExampleSelective(@Param("record") SysNode record, @Param("example") SysNodeExample example);

    int updateByExample(@Param("record") SysNode record, @Param("example") SysNodeExample example);

    int updateByPrimaryKeySelective(SysNode record);

    int updateByPrimaryKey(SysNode record);
}