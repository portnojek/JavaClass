package com.company.week3;

import java.util.Arrays;
import java.util.Map;

public class ExampleForMultiDimensionsArray {

    public static void main(String[] args) {
        String[][] array = {
                {"g1e1", "g1e2"},
                {"g2e1", "g2e2", "g2e3"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(array[2]));
        array2();
        System.out.println(array[2][1]);
        array[2][1] = "new";
        System.out.println(array[2][1]);
//        printArray(array);

        System.out.println("==========");

//        printArray2(array);
        System.out.println(generateRandomValue());
        System.out.println("==========");

        int[][] matrix = createMatrix(4, 6);
        printArray2(matrix);
    }

    public static void array2() {
        int[][] array2 = new int[4][];
        array2[0] = new int[5];
        array2[1] = new int[3];
        array2[2] = new int[2];
        array2[3] = new int[8];
        System.out.println(Arrays.toString(array2[0]));
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(Arrays.toString(array2[2]));
        System.out.println(Arrays.toString(array2[3]));

    }

    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = generateRandomValue();
            }
        }
        return matrix;
    }

    ;

    private static int generateRandomValue() {
        int min = 0;
        int max = 10;
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    private static void printArray(int[][] toprint) {

        for (int row = 0; row < toprint.length; row++) {
            for (int column = 0; column < toprint[row].length; column++) {
                System.out.println("accessing: [" + row + "][" + column + "]: " + toprint[row][column]);
            }

        }
    }

    private static void printArray2(int[][] toPrint) {
        for (int[] internArray : toPrint) {
            System.out.println(Arrays.toString(internArray));
        }
    }
}




