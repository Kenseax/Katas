package com.example.demo.javacode;

import java.util.Arrays;
import java.util.stream.IntStream;

/* Написать метод для возведения каждого числа в степень
   Дан отсортированный массив. Возвращаемое значение так же отсортированный массив
   Пример: {-4, -2, 1, 3}
   Вывод: {1, 4, 9, 16}
*  */

public class SortedSquares {

    static int[] nums = {-4, -2, 1, 3};

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


    public static int[] sortedSquaresV2(int[] nums) {
        return IntStream.of(nums).map(x -> x * x).sorted().toArray();
    }
}
