package com.company.fundamentals.OperatorsLoopsConditionalsASO;

public class LoopExampleWhile {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        while (a < 12 && b > 2){
            System.out.println("a= " + a);
            System.out.println("b= " + b);
            a++;
            b--;
        }
        System.out.println("koniec petli");
    }
}
