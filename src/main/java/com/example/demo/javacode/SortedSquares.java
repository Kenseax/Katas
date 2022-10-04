package com.example.demo.javacode;

import java.util.Arrays;

/* Написать метод для возведения каждого числа в степень
   Дан отсортированный массив. Возвращаемое значение так же отсортированный массив
   Пример: {-4, -2, 1, 3}
   Вывод: {1, 4, 9, 16}
*  */

public class SortedSquares {

    public static void main(String[] args) {
    }

    public int[] sortedSquares(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i] * nums[i];
        }
        Arrays.sort(array);
        return array;
    }
}
