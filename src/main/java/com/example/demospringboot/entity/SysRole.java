package com.example.demospringboot.entity;

public class SysRole {
    private String jsbh;

    private String jsmc;

    public String getJsbh() {
        return jsbh;
    }

    public void setJsbh(String jsbh) {
        this.jsbh = jsbh == null ? null : jsbh.trim();
    }

    public String getJsmc() {
        return jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc == null ? null : jsmc.trim();
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "jsbh='" + jsbh + '\'' +
                ", jsmc='" + jsmc + '\'' +
                '}';
    }
}