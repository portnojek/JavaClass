package com.company.week3;

public class LoopExampleForBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("only i " + i);
            for (int j = 0; j < 12; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("for " + i + ", i and j: " + i + " and " + j);
            }
        }
    }
}
