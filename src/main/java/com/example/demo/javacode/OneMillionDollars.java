package com.example.demo.javacode;

// Найти через сколько месяцев сумма дойдёт до заданной с установленной процентной ставкой;

public class OneMillionDollars {
    public static void main(String[] args) {
        System.out.println(calculateWhenIWillRich(1000f, 1f, 1000000f));
    }

    public static int calculateWhenIWillRich(float smallMoney, float percent, float bigMoney) {
        int months = 0;

        while (smallMoney < bigMoney) {
            smallMoney += smallMoney * (percent / 100);
            months++;
        }

        System.out.print(months / 12 + " лет и ");
        System.out.println(months % 12 + " месяцев...");
        return months;
    }
}
