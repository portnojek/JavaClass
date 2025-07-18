package com.company.fundamentals.OperatorsLoopsConditionalsASO;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int c = 100;
        int d = 101;
        int result = a + b == 4 ? 12 : 15;
        System.out.println(result);

        String result2 = a + b > 4 ? someOperator1() : someOperator2();
        System.out.println(result2);

        String result3 = a + b > 0 ? someOperator3(a, b) : someOperator3(c, d);
        System.out.println(result3);

    }

    public static String someOperator1() {
        return "someOperator1";
    }

    public static String someOperator2() {
        return "someOperator2";
    }

    private static String someOperator3(int a, int b) {
        return a + b > 0 ? someOperator1() : someOperator2();
    }
}
