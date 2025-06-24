package com.company.week3;

public class LoopExampleDoWhile {
    public static void main(String[] args) {
        int a = 14;
        do {
            System.out.println("trere");
            someMethod(a);
            a--;

        } while (a > 12);
        System.out.println("end of program");
    }
    private static void someMethod(int i){
        System.out.println(i);
    }
}