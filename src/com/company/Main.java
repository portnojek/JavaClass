package com.company;

import com.company.animal.Cat;
import com.company.animal.Dog;

import java.sql.SQLOutput;

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

        int a = 1;
        int b = 2;
        int c = a;

        System.out.println("zmienna a: " + a);
        System.out.println("zmienna b: " + b);
        System.out.println("zmienna c: " + c);
        String test = "tata" + 10; //sama liczba to już by zwróciła błą∂
        System.out.println(test);
        String name1 = "BARTEK";
        String name2 = new String("Bartek");
        String strangename = "      to    wcaclle   nie jest dziwne  zdanie     ";

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.intern() == name2);

        String sentence = "BartekUczySieJavyZRoznymSkutkiem";
        System.out.println("charAt: " + sentence.charAt(3));
        System.out.println("charAt: " + sentence.charAt(3) + " " + sentence.concat(name1));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name2.equalsIgnoreCase(name1));
        System.out.println(name1.length());
        System.out.println(name2.replace("a", "c"));
        System.out.println(name2.substring(3));
        System.out.println(name1.substring(1, 4));
        System.out.println(name1.toLowerCase());
        System.out.println(name2.toUpperCase());
        System.out.println(strangename.trim());
        System.out.println(strangename.contains("zdanie"));
        externalMethod(method1() + method2(method3() + method4()));
    }

    static void externalMethod(int arg) {
        System.out.println("externalMethod");
        System.out.println(arg);
    }

    private static int method1() {
        System.out.println("method1");
        return 1;
    }

    private static int method2(int i) {
        System.out.println("method2");
        return i;
    }

    private static int method3() {
        System.out.println("method3");
        return 3;
    }

    private static int method4() {
        System.out.println("method4");
        return 4;
    }
}
