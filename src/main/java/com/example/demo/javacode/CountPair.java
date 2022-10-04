package com.example.demo.javacode;

/**
 *  made by Andrey Grishin
 */
/*  Найти в массиве пары чисел, которые в сумме дают 0
    Пример: -2 + 2 / 5 + -5
* */
public class CountPair {
    public static int[] arr = {1, 3, -1, 5, 7, -3};

    public static void main(String[] args) {
        System.out.println(countPair(arr));
    }

    public static int countPair(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
