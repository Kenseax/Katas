package com.example.demo.javacode;

public class StringIntern {
    public static void main(String[] args) {
        String s1 = new String("aaa").intern();
        String s2 = "aaa";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        String s3 = "aa" + "a";
        System.out.println(s1 == s3);
    }
}
