package com.example.demospringboot.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(value = "登录表单")
public class TbUser {
    @ApiModelProperty("用户id")
    @NotNull(message = "请输入id")
    private Integer id;
    @ApiModelProperty("用户名")
    @Length(max = 10,message = "名字太长")
    private String username;
    private String password;
    private String phone;
    private String email;
    private String created;
    private String updated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }

    public TbUser(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUser tbUser = (TbUser) o;
        return Objects.equals(id, tbUser.id) &&
                Objects.equals(username, tbUser.username) &&
                Objects.equals(password, tbUser.password) &&
                Objects.equals(phone, tbUser.phone) &&
                Objects.equals(email, tbUser.email) &&
                Objects.equals(created, tbUser.created) &&
                Objects.equals(updated, tbUser.updated);
    }

    public TbUser(String username, String phone) {
        this.username = username;
        this.phone = phone;
    }

    public TbUser(String username, String phone, String email) {
        this.username = username;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, phone, email, created, updated);
    }
}
