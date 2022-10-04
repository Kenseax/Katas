package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/* Написать метод для фильтрации мата
   (можно добавить список слов исключений, например "бляха")
   Пример: ввод Привет, долбоёб
   Вывод: Привет, долбо***
* */
public class FilterBadWords {
    static String phrase = "привет, долбоёб";
    static List<String> badWords = new ArrayList<>();

    static {
        badWords.add("ёб");
        badWords.add("хуй");
        badWords.add("пизд");
        badWords.add("бля");
    }

    public static void main(String[] args) {
        System.out.println(replaysBadWords(badWords, phrase));
        System.out.println(replaysBadWords(badWords, "Я сегодня видел Пизду и хуй"));
        System.out.println(replaysBadWords(badWords, "у папы новая бляха"));
    }

    public static String replaysBadWords(List<String> cache, String phrase) {
        StringBuilder resultString = new StringBuilder(phrase.toLowerCase());
        for (String word : cache) {
            int indexOfWord = resultString.indexOf(word);
            if (phrase.toLowerCase().contains(word)) {
                resultString.replace(indexOfWord,
                        indexOfWord + word.length(),
                        "***");
            }
        }
        return resultString.toString();
    }

}
