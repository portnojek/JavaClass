package com.company.week3;

public class SwitchInMethod {

    public static void main(String[] args) {
        System.out.println("case: "+ someSwitch(123, 222));
    }

    private static int someSwitch(int a, int b) {
        switch (a + b) {
            case 1:
            case 7:
            case 8:
            case 9:
                System.out.println("switch1");
                return 1;
            case 2:
                System.out.println("switch2");
                return 2;
            case 3:
                System.out.println("switch3");
                return 3;
            default:
                System.out.println("switch4");
        }
        return 5;
    }
}
