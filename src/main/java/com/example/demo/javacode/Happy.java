package com.example.demo.javacode;

public class Happy {

    public static int myNumber = 19;

    public static void main(String[] args) {
        System.out.println(isHappy(myNumber));
    }

    public static boolean isHappy(int number) {
        int summ;
        do {
            int digit;
            summ = 0;
            while (number >= 1) {
                digit = number % 10;
                summ += digit * digit;
                number = number / 10;
            }
            number = summ;
            System.out.println(number);
        } while (summ > 10);
        return summ == 1;
    }
}
