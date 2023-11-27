package com.example.demo.javacode;

import java.util.HashMap;
import java.util.Map;

/**
 * посчитать кол-во вхождений слов в строку
 */

public class CountWords {
    public static void main(String[] args) {
        String text = "1 2 3 4 5 34 21 23  1 2 3 5 6 7 1";
        System.out.println(countWords(text));
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, ++count);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}
