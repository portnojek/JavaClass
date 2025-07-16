package com.company.exercises.week4.eat;

public class Person {

    public void eat(Bread bread) {
        System.out.println("Bread");
    }

    public void eat(Bread bread, Cucumber cucumber) {
        System.out.println("Bread, Cucumber");
    }

    public void eat(Bread bread, Cucumber cucumber, Milk milk) {
        System.out.println("Bread, Cucumbaer, Milk");

    }

    public void eat(Cucumber... cucumbers) {
        System.out.println("Cucumbers");
    }
}


