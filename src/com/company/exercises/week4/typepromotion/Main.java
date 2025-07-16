package com.company.exercises.week4.typepromotion;

public class Main {
    public static void main(String[] args) {
        byte by = 1;
        short sh = 12;
        int in = 123;
        long lo = 1233333332;

        Calculator calculator = new Calculator();
        calculator.show(by);
        calculator.show(sh);
        calculator.show(in);
//        calculator.show(lo);
        ThisCalculator calc = new ThisCalculator();
        calc.model = "Unitra";

        ThisCalculator calc2 = new ThisCalculator();
        calc2.model = "Pulsar";

        calc.calculate("Seiko");
        calc.calculate("Neptun");
    }
}
