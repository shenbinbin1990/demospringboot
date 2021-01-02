package com.example.demospringboot.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("person")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @TableId(value = "id",type = IdType.AUTO)
    private String id;
    private String name;
    @TableField(fill = FieldFill.INSERT)
    private Date create;
    private Date update;
};
