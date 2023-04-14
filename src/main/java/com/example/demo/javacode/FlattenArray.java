package com.example.demo.javacode;

import java.util.ArrayList;
import java.util.Arrays;

public class FlattenArray {

    public static void main(String[] args) {
        Object[] arr3 = {7, 8, 9};
        Object[] arr4 = {10, 11, 12};
        Object[] arr1 = {1, 2, arr3, 3};
        Object[] arr2 = {4, arr4, 5, 6};
        Object[] arr = {31, 32, arr1, 33, arr2, 34, 35};
        System.out.println(Arrays.toString(flatten(arr)));
    }

    public static Object[] flatten(Object[] arr) {
        ArrayList<Object> flattened = new ArrayList<Object>();

        for (Object obj : arr) {
            if (obj instanceof Object[]) {
                Object[] innerArr = flatten((Object[]) obj);
                for (Object innerObj : innerArr) {
                    flattened.add(innerObj);
                }
            } else {
                flattened.add(obj);
            }
        }
        return flattened.toArray();
    }
}
