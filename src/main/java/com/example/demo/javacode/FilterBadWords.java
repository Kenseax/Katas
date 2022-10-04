package com.example.demo.javacode;

import java.util.ArrayList;
import java.util.List;

/* Написать метод для фильтрации мата
   (можно добавить список слов исключений, например "бляха")
   Пример: ввод Привет, долбоёб
   Вывод: Привет, долбо***
* */
public class FilterBadWords {
    public static String text = "Чувства в кулак, волю в узду!\n" +
            "Рабочий, работай!\n" +
            "Не охай!\n" +
            "Не ахай!\n" +
            "Выполнил план — посылай всех в пизду!\n" +
            "А не выполнил —\n" +
            "Сам иди нахуй!\n" +
            "Сам иди нахуй!\n" +
            "На хую я вас вертел!!!";
    public static List<String> zamena = new ArrayList<>();

    public static void main(String[] args) {

        zamena.add("хуй");
        zamena.add("хую");
        zamena.add("пизд");
        zamena.add("жопа");

        System.out.println(check(text));
    }

    public static String check(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int indexOfMat = 0;
        for (String mat : zamena) {
            indexOfMat = sb.indexOf(mat);
            while (indexOfMat >= 0) {
                sb.replace(indexOfMat, indexOfMat + mat.length(), "***");
                indexOfMat = sb.indexOf(mat);
            }
        }
        return sb.toString();
    }

}
