package com.xyf;

import com.xyf.lombok_builder.Pojo;

public class Main {
    public static void main(String[] args) {
        Pojo pojo = Pojo.builder().name("xyf").age(18).build();
        System.out.println(pojo.toString());
    }
}