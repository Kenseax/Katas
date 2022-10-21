package com.example.demo.javacode.lifeCoding;

/*

что выведет данный код?

 */

public class PrintLenght2 {

    class A {
        String str = "ab";

        A() {
            new B().printLenght();
        }

        void printLenght() {
            System.out.println(str.length());
        }
    }

    class B extends A {
        String str = "abc";

        void printLenght() {
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        new PrintLenght2().new B();
    }
}
