package com.example.demospringboot.entity;

public class SysNodeRoleKey {
    private String nodeCode;

    private String jsbh;

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode == null ? null : nodeCode.trim();
    }

    public String getJsbh() {
        return jsbh;
    }

    public void setJsbh(String jsbh) {
        this.jsbh = jsbh == null ? null : jsbh.trim();
    }
}