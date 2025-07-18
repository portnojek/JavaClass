package exercises;

import java.util.Scanner;

public class Exercise04ConditionalStatementsP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        leapYear(scanner);
//        maximum(scanner);
//        oddNumber(scanner);
        month(scanner);

        scanner.close();

    }

    private static void leapYear(Scanner scanner) {
        System.out.println("Wpisz rok, a powiem Ci czy jest przestępny czy nie");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("TAK");
        } else System.out.println("NIE");
    }

    private static void maximum(Scanner scanner) {
        System.out.println("wpisz 3 dowolne liczby, powiem Ci która jest największa");
        int[] max = new int[3];
        for (int i = 0; i < max.length; i++) {
            max[i] = scanner.nextInt();
        }
        int maxValue = max[0];
        for (int i = 1; i < max.length; i++) {
            if (max[i] > maxValue) {
                maxValue = max[i];
            }
        }
        System.out.println("Największa liczba to: " + maxValue);
    }

    private static void oddNumber(Scanner scanner) {
        System.out.println("wpisz dowonlną liczbę, a ja powiem Ci czy jest parzysta czy nieparzysta");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }
    }

    private static void month(Scanner scanner) {
        System.out.println("wpisz numer miesiąca");
        int numberOfMonth = scanner.nextInt();
        int numberOfDays = 0;
        switch (numberOfMonth) {
            case 12:
                System.out.println("Grudzień");
                numberOfDays += 31;
            case 11:
                System.out.println("Listopad");
                numberOfDays += 30;
            case 10:
                System.out.println("Październik");
                numberOfDays += 31;
            case 9:
                System.out.println("Wrzesień");
                numberOfDays += 30;
            case 8:
                System.out.println("Sierpień");
                numberOfDays += 31;
            case 7:
                System.out.println("Lipiec");
                numberOfDays += 31;
            case 6:
                System.out.println("Czerwiec");
                numberOfDays += 30;
            case 5:
                System.out.println("Maj");
                numberOfDays += 31;
            case 4:
                System.out.println("Kwiecień");
                numberOfDays += 30;
            case 3:
                System.out.println("Marzec");
                numberOfDays += 31;
            case 2:
                System.out.println("Luty");
                numberOfDays += 28;
            case 1:
                System.out.println("Styczeń");
                numberOfDays += 31;
                System.out.println("Od początku roku minęło: " + numberOfDays + " dni.");
                break;
            default:
                System.out.println("Nie ma takiego miesiąca");
                return;
        }
        System.out.println("koniec ćwieczeń z rodziału 4");
    }
}
