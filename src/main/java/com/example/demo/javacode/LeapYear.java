package com.example.demo.javacode;

public class LeapYear {
    // делится на 4 не делится на 100
    // делится на 400

    // public static int myData = LocalDate.now().getYear();
    public static int myData = 1900;

    public static void main(String[] args) {
        System.out.println(myData);
        if ((myData % 4 == 0 && myData % 100 != 0) || (myData % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год НЕ високосный!!!");
        }
    }


}
