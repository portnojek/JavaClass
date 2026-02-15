package com.company.oop.passbyreferenceandvalue;

public class Main {
    public static void main(String[] args) {
        int b = 10;
        System.out.println(b);
        test(b);
    }

    static void test(int a) {
        a = 5;
        System.out.println(a);
    }
}
