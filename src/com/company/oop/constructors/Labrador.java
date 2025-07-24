package com.company.oop.constructors;

public class Labrador extends Dog {
    private Labrador() {
        super();
        System.out.println("Labrador created");
    }

    public Labrador(int i) {
        this(String.valueOf(i));
        System.out.println("Labrador created with int");
    }

    private Labrador(String name) {
        this();
        System.out.println("Labrador created with String");
    }
}
