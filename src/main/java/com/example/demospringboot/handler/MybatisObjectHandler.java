package com.example.demospringboot.handler;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MybatisObjectHandler extends MetaObjectHandler {

    //插入时的填充出的略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("star insert fill...");
        //setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject)
        this.setFieldValByName("create",new Date(),metaObject);
        this.setFieldValByName("update",new Date(),metaObject);
    }
    //更新时填充
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("star update fill...");
        //setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject)
        this.setFieldValByName("update",new Date(),metaObject);
    }
}
