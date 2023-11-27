package com.example.demo.javacode;

public class ddd {

    public static void main(String[] args) {
 fun(4);
    }

    public static void fun(int x) {
        if (x > 0) {
            fun(--x);
            System.out.println(x + " ");
            fun(--x);
        }
    }
}
