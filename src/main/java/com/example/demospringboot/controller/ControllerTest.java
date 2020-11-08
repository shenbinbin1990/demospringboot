package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Teacher;

public class ControllerTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("shen",33);
//        t.setName("王老师");
        System.out.println(t.getName());

    }
}
