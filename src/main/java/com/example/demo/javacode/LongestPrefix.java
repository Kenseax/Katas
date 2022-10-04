package com.example.demo.javacode;

/**
 *  made by Andrey Grishin
 */

/* Написать метод, который возвращает максимальный префикс
   Пример: String[] {котлета, кошка, ковёр}
   Вывод: ко
* */
public class LongestPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String lowestWord = strs[0];

        for (String s : strs) {
            if (s.length() < lowestWord.length()) {
                lowestWord = s;
            }
        }
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < lowestWord.length(); i++) {
            for (String s : strs) {
                if (lowestWord.toCharArray()[i] != s.toCharArray()[i]) {
                    return res.toString();
                }
            }
            res.append(lowestWord.charAt(i));
        }

        return res.toString();
    }
}
