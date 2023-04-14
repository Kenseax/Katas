package com.example.demo.javacode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  made by Andrey Grishin
 */

/* Найти первое уникальное число в массиве
   Пример: int[] = {3, 4, 3, 1, 5, 2, 1}.
   Вывод: 4
* */
public class FirstUniqueNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3, 4, 3, 1, 5, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        int j;
        for (int i = 0; i < nums.length; i++) {
            for (j = 0; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (i != j)) {
                    break;
                }
            }
            if (j == nums.length) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int findFirstUnique1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Заполнение хэш-таблицы с подсчетом количества каждого элемента
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Поиск первого уникального элемента
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        // Если уникальный элемент не найден
        return -1;
    }

    public static int findFirstUnique(int[] arr) {
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        OptionalInt firstUnique = Arrays.stream(arr)
                .filter(i -> frequencyMap.get(i) == 1)
                .findFirst();

        return firstUnique.orElse(-1);
    }

}