package com.company.week3;

public class Switch {
    public static void main(String[] args) {
        int a = someMethod(); // switcha nie można stosować do double
        switch (a) {
            case 1:
            case 7:
            case 8:
            case 9:
                System.out.println("switch1");
                break;
            case 2:
                System.out.println("switch2");
                break;
            case 3:
                System.out.println("switch3");
                break;
            default:
                System.out.println("switch4");
                break;
        }
    }

    private static int someMethod() {
        return 2;
    }
}
