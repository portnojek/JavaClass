package com.company.fundamentals.OperatorsLoopsConditionalsASO;

public class LoopExampleForContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("only i " + i);
            for (int j = 0; j < 12; j++) {
                if (i == 2 || i == 5) {
                    continue;
                }
                System.out.println("for " + i + ", i and j: " + i + " and " + j);
            }
        }
    }
}
