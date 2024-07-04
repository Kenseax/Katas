package com.example.demo.javacode;

import java.util.HashMap;
import java.util.Map;

public class Bankomat {
    // Хранит количество доступных купюр различных номиналов в банкомате
    private Map<Integer, Integer> availableNotes;

    // Конструктор класса, инициализирует банкомат начальным набором купюр
    public Bankomat(Map<Integer, Integer> initialNotes) {
        this.availableNotes = new HashMap<>(initialNotes);
    }

    // Метод для снятия заданной суммы с банкомата
    public boolean withdraw(int amount) {
        // Проверка на корректность суммы (должна быть положительной и кратной 50)
        if (isAmountValid(amount)) {
            // Рассчитывает результат снятия
            Map<Integer, Integer> withdrawalResult = calculateWithdrawal(amount);
            // Если снятие возможно, обновляет состояние банкомата и выводит результат
            if (withdrawalResult != null) {
                updateAvailableNotes(withdrawalResult);
                printWithdrawal(withdrawalResult);
                return true;
            } else {
                System.out.println("Не удалось выдать сумму. Попробуйте другую сумму.");
            }
        } else {
            System.out.println("Введена некорректная сумма. Пожалуйста, введите сумму, кратную 50.");
        }
        return false;
    }

    // Проверяет, является ли сумма корректной (положительной и кратной 50)
    private boolean isAmountValid(int amount) {
        return amount > 0 && amount % 50 == 0;
    }

    // Рассчитывает необходимое количество купюр для снятия заданной суммы
    private Map<Integer, Integer> calculateWithdrawal(int amount) {
        Map<Integer, Integer> withdrawalResult = new HashMap<>();
        int remainingAmount = amount;

        // Перебирает купюры в порядке убывания номиналов
        for (int note : new int[]{5000, 1000, 500, 100, 50}) {
            int noteCount = remainingAmount / note;
            int availableCount = availableNotes.getOrDefault(note, 0);

            // Если есть доступные купюры и их достаточно, добавляет их в результат
            if (noteCount > 0 && availableCount > 0) {
                int countToWithdraw = Math.min(noteCount, availableCount);
                withdrawalResult.put(note, countToWithdraw);
                remainingAmount -= countToWithdraw * note;
            }
        }

        // Если удалось снять всю сумму, возвращает результат, иначе - null
        return remainingAmount == 0 ? withdrawalResult : null;
    }

    // Обновляет количество доступных купюр после успешного снятия
    private void updateAvailableNotes(Map<Integer, Integer> withdrawalResult) {
        for (Map.Entry<Integer, Integer> entry : withdrawalResult.entrySet()) {
            int note = entry.getKey();
            int countToWithdraw = entry.getValue();
            int currentCount = availableNotes.get(note);
            availableNotes.put(note, currentCount - countToWithdraw);
        }
    }

    // Выводит на экран информацию о снятых купюрах
    private void printWithdrawal(Map<Integer, Integer> withdrawalResult) {
        System.out.println("Выдано:");
        for (Map.Entry<Integer, Integer> entry : withdrawalResult.entrySet()) {
            int note = entry.getKey();
            int countToWithdraw = entry.getValue();
            System.out.println(countToWithdraw + "x" + note);
        }
    }
}
