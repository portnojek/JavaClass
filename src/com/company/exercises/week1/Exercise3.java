package com.company.exercises.week1;

//operators
public class Exercise3 {
    public static void main(String[] args) {

        calculator(3.5, 5.6);
        operators();

    }

    private static void calculator(double firtNumber, double secondNumber) {

        double addition = firtNumber + secondNumber;
        double subtraction = firtNumber - secondNumber;
        double multiplication = firtNumber * secondNumber;
        double division = firtNumber / secondNumber;
        System.out.println("Addition is: " + addition);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Multiplcation is: " + multiplication);
        System.out.println("Division is: " + division);

    }

    private static void operators() {
        int x = 0;
        if (x == 0) {
            System.out.println("x jest równe 0");
        }
        if (!(x != 0)) {
            System.out.println("x nie jest różne od 0");
        }
        x++;
        System.out.println("x zwiekszone o 1: " + x);

        x*=5;
        System.out.println("x pomnozone przez 5: " + x);

        x-=3;
        System.out.println("x zmiejszone o 3: " + x);

        if(x != 0){
            System.out.println("x jest rózne od 0 i wynosi: " + x);
        }
    }
}
