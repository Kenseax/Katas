package com.example.demo.javacode;

// by d__kadyrbaev

// Проверить правильность составленного судоку:
// Дана матрица 9*9 в которой должны быть соблюдены условия:
// все строки и столбцы состоят из цифр 1 - 9 без повторений
// и, если разделить матрицу последовательно на девять матриц 3*3, каждая мини-матрица
// должна состоять из цифр 1 - 9 без повторений
// (Больше по ссылке: http://en.wikipedia.org/wiki/Sudoku)

// Sudoku is a game played on a 9x9 grid.
// The goal of the game is to fill all cells of the grid with digits from 1 to 9,
// so that each column, each row, and each of the nine 3x3 sub-grids (also known as blocks)
// contain all the digits from 1 to 9.

// validSolution([
//        [5, 3, 4, 6, 7, 8, 9, 1, 2],
//        [6, 7, 2, 1, 9, 5, 3, 4, 8],
//        [1, 9, 8, 3, 4, 2, 5, 6, 7],
//        [8, 5, 9, 7, 6, 1, 4, 2, 3],
//        [4, 2, 6, 8, 5, 3, 7, 9, 1],
//        [7, 1, 3, 9, 2, 4, 8, 5, 6],
//        [9, 6, 1, 5, 3, 7, 2, 8, 4],
//        [2, 8, 7, 4, 1, 9, 6, 3, 5],
//        [3, 4, 5, 2, 8, 6, 1, 7, 9]
//        ]); // => true

// validSolution([
//        [5, 3, 4, 6, 7, 8, 9, 1, 2],
//        [6, 7, 2, 1, 9, 0, 3, 4, 8],
//        [1, 0, 0, 3, 4, 2, 5, 6, 0],
//        [8, 5, 9, 7, 6, 1, 0, 2, 0],
//        [4, 2, 6, 8, 5, 3, 7, 9, 1],
//        [7, 1, 3, 9, 2, 4, 8, 5, 6],
//        [9, 0, 1, 5, 3, 7, 2, 1, 4],
//        [2, 8, 7, 4, 1, 9, 6, 3, 5],
//        [3, 0, 0, 4, 8, 1, 1, 7, 9]
//        ]); // => false

import java.util.HashSet;
import java.util.Set;

public class Sudoku {

    public static void main(String[] args) {

        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println(check(sudoku));
    }

    public static boolean check(int[][] sudoku) {

        for (int[] ints : sudoku) {
            Set<Integer> x = new HashSet<>();
            int ff = 0;
            for (int anInt : ints) {
                x.add(anInt);
                ff += anInt;
            }
            if (x.toArray().length != 9 || ff != 45) return false;
        }

        for (int[] i : sudoku) {
            Set<Integer> y = new HashSet<>();
            int ff = 0;
            for (int k = 0; k < sudoku.length; k++) {
                y.add(i[k]);
                ff += i[k];
            }
            if (y.toArray().length != 9 || ff != 45) return false;
        }

        for (int m = 0; m < 9; m += 3) {
            for (int k = 0; k < 9; k += 3) {
                Set<Integer> miniSudoku = new HashSet<>();
                int ff = 0;
                for (int i = m; i < m + 3; i++) {
                    for (int j = k; j < k + 3; j++) {
                        miniSudoku.add(sudoku[i][j]);
                        ff += sudoku[i][j];
                    }
                }
                if (miniSudoku.toArray().length != 9 || ff != 45) return false;
            }
        }

        return true;
    }
}
