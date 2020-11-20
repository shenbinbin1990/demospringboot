package com.example.demospringboot.entity;

public class SysNode {
    private String nodeId;

    private String nodeCode;

    private String nodeNamec;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode == null ? null : nodeCode.trim();
    }

    public String getNodeNamec() {
        return nodeNamec;
    }

    public void setNodeNamec(String nodeNamec) {
        this.nodeNamec = nodeNamec == null ? null : nodeNamec.trim();
    }
}