package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise05Loops {
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

//TODO
//1. Napisz program, który na ekranie będzie w stanie wydrukować następujący ciąg znaków
//39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16. Napisz ten program w taki sposób,
//aby można było podać długość drukowanego ciągu, np 1000. Zauważ, że na końcu ciągu nie ma
//przecinka, są tylko w środku !
//2.Napisz program drukujący na ekranie ciąg Fibonacciego. Wydrukuj pierwsze 20 znaków ciągu. Znaki
//ciągu możesz oddzielić spacją.
//
//3. Napisz program drukujący ciąg znaków jak poniżej. Napisz to tak, żeby liczenie doszło do 999.
//Postaraj się wykorzystać pętle zagnieżdżone, tzn. nie pisz czegoś takiego:
//System.out.println("####"); wielokrotnie pod sobą.
//111
//####
//####
//####
//####
//222
//####
//####
//####
//####
//333
//####
//####
//####
//####
}


