package com.company.week3;

public class ComplicatedOperators {

    public static void main(String[] args) {
        int a = 3;
        a += 2; //inkrementacja o 2
        System.out.println("a=: " + a);

        a = +2; // tak naprawdę jest to przypisanie do zmiennej
        System.out.println("a=: " + a);

        int b = 9;
        b -= 1;
        System.out.println("b=: " + b);

        int d = 100;
        d /= 4;
        System.out.println("d=: " + d);

        int e = 7;
        e %= 2;
        System.out.println("e=: " + e);

        int w = e % 2;
        System.out.println("w=: " + w);

        boolean f = true;
        f &= false; // f = f & false rzadko spotykane
        System.out.println(f);
    }
}
