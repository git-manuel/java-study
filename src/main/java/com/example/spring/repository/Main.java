package com.example.spring.repository;

import lombok.Data;

import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        var v1 = new A();
        var v2 = new A();

        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode());
    }


    static class A {
        public String att = "hello";


        public boolean equals(Object o) {
            return false;
        }
    }
}



