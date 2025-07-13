package com.company.exercises.week1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        silnia(scanner);

//        if (czyPalindrom(scanner)) {
//            System.out.println("To słowo to palindrom");
//        } else {
//            System.out.println("To słowo to nie palindrom");
//        }
        pencilsLines();
        pencilsLines2();
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " jest liczbą pierwszą");
            } else {
                System.out.println(i + " nie jest liczbą pierwszą");
            }
        }
    }

    //silnia
    private static void silnia(Scanner scanner) {
        System.out.println("Podaj liczbę, od której chcesz policzyć silnię");
        int number = scanner.nextInt();
        int[] tablica = new int[number];
        int silnia = 1;
        for (int i = 0; i < number; i++) {
            tablica[i] = i + 1;
            silnia *= tablica[i];

        }
        System.out.println(Arrays.toString(tablica));
        System.out.println(silnia);
    }

    //czypalindrom
    private static boolean czyPalindrom(Scanner scanner) {
        String word = scanner.nextLine();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    private static void pencilsLines() {
        String[] pencil = {"czerwony", "zielony", "niebieski", "czarny", "żółty", "brązowy"};
        int totalLines = 100;
        int pencilIndex = totalLines % pencil.length - 1;

        System.out.println(pencil[pencilIndex]);
    }

    private static void pencilsLines2() {
        String[] pencil = {"czerwony", "zielony", "niebieski", "czarny", "żółty", "brązowy"};
        int totalLines = 100;
        for (int i = 0; i < totalLines; i++) {
            System.out.println("| " + (i + 1) + " " + pencil[i % pencil.length]);
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) { // zamiast Math.sqrt()
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


