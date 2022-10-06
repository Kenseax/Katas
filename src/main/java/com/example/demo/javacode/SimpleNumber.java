package com.example.demo.javacode;

/*

Вывести все простые числа до n

 */


public class SimpleNumber {
    private static int number = 97;

    public static void main(String[] args) {
        simpleNumber(number);
    }

    public static void simpleNumber(int number) {
        boolean simple = true;
        for (int i = 1; i <= number; i++) {
            for (int y = 2; y < i; y++) {
                if (i % y == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.println(i);
            }
            simple = true;
        }
    }
}
