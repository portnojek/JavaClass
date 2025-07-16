package com.company.exercises.week4.equalsperplesxity;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", 30);
        Person p2 = new Person("Jan", 30);

        System.out.println(p1.equals(p2));

        System.out.println(p1);
        String personanongrata = p2.toString();
        System.out.println(personanongrata);

    }

}

