package com.company.AutoboxingUnboxing;

public class Main {
    public static void main(String[] args) {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
