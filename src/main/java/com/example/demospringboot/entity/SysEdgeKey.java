package com.example.demospringboot.entity;

public class SysEdgeKey {
    private String fromNode;

    private String toNode;

    public String getFromNode() {
        return fromNode;
    }

    public void setFromNode(String fromNode) {
        this.fromNode = fromNode == null ? null : fromNode.trim();
    }

    public String getToNode() {
        return toNode;
    }

    public void setToNode(String toNode) {
        this.toNode = toNode == null ? null : toNode.trim();
    }
}