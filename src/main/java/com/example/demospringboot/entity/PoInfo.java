package com.example.demospringboot.entity;

public class PoInfo {
    private String pobh;

    private String dqjdzt;

    public String getPobh() {
        return pobh;
    }

    public void setPobh(String pobh) {
        this.pobh = pobh == null ? null : pobh.trim();
    }

    public String getDqjdzt() {
        return dqjdzt;
    }

    public void setDqjdzt(String dqjdzt) {
        this.dqjdzt = dqjdzt == null ? null : dqjdzt.trim();
    }
}