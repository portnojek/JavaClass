package com.company.fundamentals.OperatorsLoopsConditionalsASO;

import java.util.Arrays;

public class ExampleForMultiDimensionsArray2 {

    public static void main(String[] args) {
        String[][] array = {
                {"g1e1", "g1e2"},
                {"g2e1", "g2e2", "g2e3"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };

        int[][] matrix = {
                {0, 8, 2},
                {2, 5, 1},
                {3, 9, 7}
        };
        printArray2(matrix);
        breakAndContinueExample(matrix);
//        printArray2(matrix);
        printSum(matrix);
        printLargestNumberInRow(matrix);
    }

    private static void printSum(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
            System.out.println("Array: " + Arrays.toString(matrix[row]) + " sum: " + sum);
        }
    }

    private static void printLargestNumberInRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int largest  = matrix[row][0];
            for (int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column]>largest){
                    largest = matrix[row][column];
                }
            }
            System.out.println("Largest element in row: " + Arrays.toString(matrix[row]) + " el: " + largest);
        }
    }

        private static void breakAndContinueExample ( int[][] example){
            for (int row = 0; row < example.length; row++) {
                if (row > 1) {
                    break;
                }
                for (int column = 0; column < example[row].length; column++) {
                    if (column < 1) {
                        continue;
                    }
                    System.out.println("accessing: [" + row + "][" + column + "]: " + example[row][column]);
                }

            }
            System.out.println("I'm here"); // gdyby zamiast break był return to ta linia się nie wydrukuje
        }

        private static void printArray ( int[][] toprint){

            for (int row = 0; row < toprint.length; row++) {
                for (int column = 0; column < toprint[row].length; column++) {
                    System.out.println("accessing: [" + row + "][" + column + "]: " + toprint[row][column]);
                }

            }
        }

        private static void printArray2 ( int[][] toPrint){
            for (int[] internArray : toPrint) {
                System.out.println(Arrays.toString(internArray));
            }
        }
    }




