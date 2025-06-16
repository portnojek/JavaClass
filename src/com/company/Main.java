package com.company;

import com.company.animal.Cat;
import com.company.animal.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Cat cat = new Cat("blue", "dark");
        System.out.println(cat.color);
        System.out.println(cat.color2);
        cat.catVoice();

        Dog dog = new Dog();
        System.out.println(dog.color);
        System.out.println(dog.color2);
        dog.dogVoice();

        }
    }