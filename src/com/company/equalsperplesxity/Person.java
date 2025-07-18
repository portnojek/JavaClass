package com.company.equalsperplesxity;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                  // ta sama referencja
        if (o == null || getClass() != o.getClass()) return false; // różna klasa
        Person person = (Person) o;
        return age == person.age &&
                (name != null ? name.equals(person.name) : person.name == null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
