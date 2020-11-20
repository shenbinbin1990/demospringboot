package com.example.demospringboot.mapper;

import com.example.demospringboot.entity.SysEdgeExample;
import com.example.demospringboot.entity.SysEdgeKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysEdgeMapper {
    int countByExample(SysEdgeExample example);

    int deleteByExample(SysEdgeExample example);

    int deleteByPrimaryKey(SysEdgeKey key);

    int insert(SysEdgeKey record);

    int insertSelective(SysEdgeKey record);

    List<SysEdgeKey> selectByExample(SysEdgeExample example);

    int updateByExampleSelective(@Param("record") SysEdgeKey record, @Param("example") SysEdgeExample example);

    int updateByExample(@Param("record") SysEdgeKey record, @Param("example") SysEdgeExample example);
}