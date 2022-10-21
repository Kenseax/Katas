package com.example.demo.javacode;

import java.util.Arrays;

public class Args {
    public static void main(String[] args) {
        if (args.length > 0){
            System.out.println(Arrays.toString(args));
        }
        else {
            System.out.println("HI !!!");
        }
    }
}
