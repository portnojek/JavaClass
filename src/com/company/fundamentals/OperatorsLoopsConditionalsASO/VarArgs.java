package com.company.fundamentals.OperatorsLoopsConditionalsASO;

public class VarArgs {
    public static void main(String[] args) {
        sum(1, 4, 5, 6, 7, 7);
    }

    public static int sum(int arg, int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        System.out.println(result);
        return result;
    }
}
