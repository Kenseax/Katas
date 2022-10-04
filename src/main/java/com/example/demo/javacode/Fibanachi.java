package com.example.demo.javacode;

import java.util.stream.Stream;

/*
    Вывод числа Фибаначи
 */

public class Fibanachi {

    static long result = 0;
    static int fib = 10;

    public static void main(String[] args) {
        System.out.println(fibanachiSumm(fib));
        System.out.println(fibFor(fib));
        System.out.println(fibonacci(fib));
        System.out.println(fibStream(fib));
    }

    public static long fibanachiSumm(int fibanachi) {
        if (fibanachi == 1) {
            return result = 1;
        }
        if (fibanachi == 2) {
            return result = 1;
        }

//  f(n) = f(n-1)+f(n-2). Это определение чисел.
//        Далее, f(1)==f(2)==1. Все.

        result = fibanachiSumm(fibanachi - 2) + fibanachiSumm(fibanachi - 1);
        return result;
    }

    public static long fibFor(int countOfElements) {
        long resultFor = 0;
        long previus = 1;
        long preprevius = 1;
        for (int i = 1; i <= countOfElements; i++) {
            if (i <= 2) {
                resultFor = 1;
            } else {
                resultFor = previus + preprevius;
                preprevius = previus;
                previus = resultFor;
            }
        }
        return resultFor;
    }

    //через формулу Бине
    public static long fibonacci(int index) {
        double fi = (1 + Math.sqrt(5)) / 2;
        //       System.out.println(fi);
        return Math.round(Math.pow(fi, index) / Math.sqrt(5));
    }

    public static Integer fibStream(int n) {
        return Stream.iterate(new int[]{1, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n)
                .map(y -> y[0])
                .max(Integer::compareTo).get();
    }

}