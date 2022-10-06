package com.example.demo.javacode;

import java.util.Arrays;

/*

повернуть матрицу по часовой стрелке

 */
public class ReversMatrix {

    static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] args) {
        reversMatrix(matrix);
    }

    public static void reversMatrix(int[][] matrix) {
        int matrixSize = matrix[0].length;
        int[][] helpMatrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int y = 0; y < matrixSize; y++) {
                // helpMatrix[i][y] = matrix[y][matrixSize - i - 1];  //  поворрот против часовой стрелки
                // helpMatrix[i][y] = matrix[y][i];  //  транспонирование
                helpMatrix[i][y] = matrix[matrixSize - y - 1][i];  //  поворот по часовой стрелке
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            System.out.println(Arrays.toString(helpMatrix[i]));
        }
    }
}
