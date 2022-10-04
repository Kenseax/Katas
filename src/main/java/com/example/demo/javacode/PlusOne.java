package com.example.demo.javacode;

import java.util.Arrays;

/**
 *  made by Andrey Grishin
 */

/* Прибавить к массиву единицу чтобы получилось новое число
   Пример: int[] {1, 2, 3}
   Вывод: {1, 2, 4}
   Пример2: {9, 9}
   Вывод2: {1, 0, 0}
* */
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
