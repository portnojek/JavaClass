package com.company.fundamentals.OperatorsLoopsConditionalsASO;

public class Testowa {
    public static void main(String[] args) {
        quiz();
    }

    private static void quiz() {
        String string1 = "Java!";
        String string2 = new String(string1);
        if ("Java!".equals(string1)) System.out.println("case 1");
        if ("Java!" == string1) System.out.println("case 2");
        if ("Java!" == string1.intern()) System.out.println("case 3");
        if ("Java!".equals(string2)) System.out.println("case 4");
        if ("Java!" == string2) System.out.println("case 5");
        if ("Java!" == string2.intern()) System.out.println("case 6");
        if ("Java!".equals(string2)) System.out.println("case 7");
        if (string2 == string1) System.out.println("case 8");
    }
}
