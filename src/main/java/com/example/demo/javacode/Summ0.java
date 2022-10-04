package com.example.demo.javacode;

import java.util.Arrays;

public class Summ0 {
    public static int[] arr = {1, 3, -1, 5, 7, -3, -5, 8, 10};

    public static void main(String[] args) {
        System.out.println(countPair(arr));
    }

    public static int countPair(int[] myArray) {
        Arrays.sort(myArray);
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 0) {
                break;
            }
            for (int y = myArray.length - 1; y > 0; y--) {
                if (myArray[y] <= 0) {
                    break;
                }
                if (myArray[i] + myArray[y] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
