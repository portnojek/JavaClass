package com.company.fundamentals.OperatorsLoopsConditionalsASO;

public class Conditionals {
    public static void main(String[] args) {
        if (true) {
            System.out.println("hello world");

            int a = 233;
            int b = 9;
            if (a > 0 && a <= 10) {
                System.out.println("a > 0 && a <= 10)");
            } else if (a > 10 && a <= 100) {
                System.out.println("a > 10 && a <= 100");
            } else if (a > 100 && a <= 1000) {
                System.out.println("a > 100 && a <= 1000");
            } else {
                System.out.println("SOME OTHER");
            }
            System.out.println("Always");

        }
    }
}

