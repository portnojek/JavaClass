package com.company.oop.polymorphism;

public class Actress implements Singable, Play {

    @Override
    public void sing() {
        System.out.println("Actress is singing");
    }

    @Override
    public void play() {
        System.out.println("Actress is playing");
    }
}
