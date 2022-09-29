package com.example.demo;

import java.util.Arrays;

/**
 *  made by Andrey Grishin
 */
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 2, 9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        if (digits[0] != 0)
            return digits;
        else {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
    }
}
