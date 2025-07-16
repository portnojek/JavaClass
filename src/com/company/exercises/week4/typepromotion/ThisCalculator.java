package com.company.exercises.week4.typepromotion;

public class ThisCalculator {
    public String model = "Sony";

    public void calculate(String model){
        System.out.println("Original model from parameter: " + this.model);
        System.out.println("Model from class field: " + model);
    }
}
