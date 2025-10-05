package com.company.oop.abstractclasses;

public abstract class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
