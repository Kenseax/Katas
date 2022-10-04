package com.example.demo.javacode;

/* Написать метод для извлечения корня
   Пример: 121 -> 11
* */

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(31866025));
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int a = 0;
        int b = Math.min(x, 46340);
        while (a * a != x && a != b && a != (b - 1)) {
            if (a * a == x) {
                return a;
            } else if (b * b == x) {
                return b;
            }
            if (((a + b) / 2) * ((a + b) / 2) == x) {
                return (a + b) / 2;
            } else if (((a + b) / 2) * ((a + b) / 2) > x) {
                b = (a + b) / 2;
            } else if (((a + b) / 2) * ((a + b) / 2) < x) {
                a = (a + b) / 2;
            }
        }
        return a;
    }

//     Красивое решение

//    public int mySqrt(int x) {
//        if(x == 0 || x == 1) return x;
//
//        int low = 1;
//        int high = Math.min(x / 2, 46340);
//
//        while(low <= high){
//            int mid = (low + (high - low) / 2);
//
//            if(mid * mid == x) return mid;
//            else if(mid * mid > x) high = mid - 1;
//            else if(mid * mid < x) low = mid + 1;
//        }
//        return high;
//    }
}
