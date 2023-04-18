package com.example.demo.javacode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 2, 5, 76, 7};
        int[] arr2 = {4, 3, 7, 4, 1, 2, 3, 4, 6, 7};

        // для вывода массива
        System.out.println(Arrays.toString(concatenate(arr1, arr2)));

    }

    // Метод объединения двух массивов в Java
    public static int[] concatenate(int[] first, int[] second) {
        int[] arr = new int[first.length + second.length];

        System.arraycopy(first, 0, arr, 0, first.length);
        System.arraycopy(second, 0, arr, first.length, second.length);

        // сортированный
        Arrays.sort(arr);

        return arr;
    }

    static <T> T[] concatenate1(T[] array1, T[] array2) {
        List<T> resultList = new ArrayList<>(array1.length + array2.length);
        Collections.addAll(resultList, array1);
        Collections.addAll(resultList, array2);

        @SuppressWarnings("unchecked")
        //the type cast is safe as the array1 has the type T[]
        T[] resultArray = (T[]) Array.newInstance(array1.getClass().getComponentType(), 0);
        return resultList.toArray(resultArray);
    }

    // Общий метод для объединения массивов одного типа в Java
    public static <T> T[] concatenate2(T[] first, T[] second) {
        T[] ob = (T[]) Array.newInstance(first.getClass().getComponentType(),
                first.length + second.length);

        System.arraycopy(first, 0, ob, 0, first.length);
        System.arraycopy(second, 0, ob, first.length, second.length);

        return ob;
    }

    // Общий метод для объединения массивов одного типа в Java
    public static <T> T[] concatenate3(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
