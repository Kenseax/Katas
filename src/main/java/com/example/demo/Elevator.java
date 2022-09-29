package com.example.demo;

import java.util.Arrays;
/**
 *  made by Andrey Grishin
 *  30.09.22
*/
public class Elevator {
    static final int MAX_WEIGHT = 250;
    static int[] weightOfPeopleArray = {60, 90, 120, 55, 92, 64, 83, 150,
            10, 21, 130, 140, 100, 30, 33};

    public static void main(String[] args) {
        System.out.println(getMinimumRide(weightOfPeopleArray, MAX_WEIGHT));
    }

    public static int getMinimumRide(int[] array, int maxWeight) {
        Arrays.sort(array);
        int result = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 250)
                continue;
            for (int j = i - 1; j >= 0; j--) {
                if (maxWeight - array[i] - array[j] >= 0) {
                    System.out.println(array[i] + " " + array[j] + " = "
                            + (array[i] + array[j]));
                    array[i] += array[j];
                    array[j] = maxWeight + 1;
                }
                if (j == 0) {
                    result++;
                    System.out.println("Следующая партия..");
                }
            }
        }
        return result;

    }
}
