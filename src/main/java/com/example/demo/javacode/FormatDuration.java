package com.example.demo.javacode;

import java.util.LinkedHashMap;
import java.util.Map;

// Перевести заданное количество секунд в человекочитаемый вид(year, day, hour, minute, second).
//
// Разделители: между последним и предпоследним значениями - " and ", между остальными - ", ".
// Нулевые значения игнорировать
// У неединичных значений окончание - s:
//      2 seconds, 15 minutes, 5 years
//      1 second, 1 hour, 1 day.
//
// В случае ввода нулевого значения вывести "now".

public class FormatDuration {

    public static void main(String[] args) {
        System.out.println(formatDuration(212121212));
    }

    public static String formatDuration(int seconds) {
        Map<String, Integer> pattern = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        pattern.put("year", seconds / (3600 * 24 * 365));
        pattern.put("day", (seconds / (3600 * 24)) % 365);
        pattern.put("hour", (seconds / 3600) % 24);
        pattern.put("minute", (seconds / 60) % 60);
        pattern.put("second", seconds % 60);

        pattern.entrySet().removeIf(e -> e.getValue() == 0);

        int size = pattern.size();

        for (String key : pattern.keySet()) {
            result.append(pattern.get(key))
                    .append(" ")
                    .append(key);

            if (pattern.get(key) != 1) result.append("s");

            if (size > 1) {
                if (size > 2) {
                    result.append(", ");
                } else {
                    result.append(" and ");
                }
                size--;
            } else {
                return result.toString();
            }
        }
        return "now";
    }
}
