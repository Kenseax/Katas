package com.example.demo.javacode;

/**
 *  made by Andrey Grishin
 */

/*  Реализовать транслитерацию из латиницы в кирилицу и обратно
    Пример: ghbdtn -> привет / ьн тфьу шы вшьф -> my name is dima
* */
public class Converter {
    static final String latin = "qwertyuiop[]asdfghjkl;'zxcvbnm,.` ";
    static final String cyrillic = "йцукенгшщзхъфывапролджэячсмитьбюё ";
    public static void main(String[] args) {
        System.out.println(convertString("qwe"));
        System.out.println(convertString("привет карапузы"));
        System.out.println(convertString("i'll be back детка"));
    }
    public static String convertString(String phrase) {
        StringBuilder convertedString = new StringBuilder();
        int latinIndex;
        int cyrillicIndex;
        for(int i = 0; i < phrase.length(); i++) {
             latinIndex = latin.indexOf(phrase.charAt(i));
             cyrillicIndex = cyrillic.indexOf(phrase.charAt(i));
            if (latinIndex >= 0) {
                convertedString.append(cyrillic.charAt(latinIndex));
            } else {
                convertedString.append(latin.charAt(cyrillicIndex));
            }
        }
        return convertedString.toString();
    }
}
