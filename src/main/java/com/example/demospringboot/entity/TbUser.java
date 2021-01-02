package com.example.demospringboot.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@ApiModel(value = "登录表单")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TbUser {
    @ApiModelProperty("用户id")
    @NotNull(message = "请输入id")
    private int id;
    @ApiModelProperty("用户名")
    @Length(max = 10,message = "名字太长")
    private Integer username;
    private String password;
    private Boolean phone;
    private String email;
    private String created;
    private String updated;

    public String getPhone() {
        return phone+"";
    }
}
