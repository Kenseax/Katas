package com.example.demo.javacode;

import com.sun.jdi.PathSearchingVirtualMachine;

public class TwoIntefaces {

    interface A {
        default void print(){
            System.out.println("A");
        }
    }
    interface B {
        default void print(){
            System.out.println("B");
        }
    }

//    public class C implements A, B{}

    public static void main(String[] args) {
//        A a = new C();
//        a.print();
    }
}
