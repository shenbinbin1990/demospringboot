package com.example.demospringboot.mapper;

import com.example.demospringboot.entity.PoInfo;
import com.example.demospringboot.entity.PoInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PoInfoMapper {
    int countByExample(PoInfoExample example);

    int deleteByExample(PoInfoExample example);

    int deleteByPrimaryKey(String pobh);

    int insert(PoInfo record);

    int insertSelective(PoInfo record);

    List<PoInfo> selectByExample(PoInfoExample example);

    PoInfo selectByPrimaryKey(String pobh);

    int updateByExampleSelective(@Param("record") PoInfo record, @Param("example") PoInfoExample example);

    int updateByExample(@Param("record") PoInfo record, @Param("example") PoInfoExample example);

    int updateByPrimaryKeySelective(PoInfo record);

    int updateByPrimaryKey(PoInfo record);
}