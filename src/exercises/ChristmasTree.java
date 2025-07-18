package exercises;

import java.util.Scanner;

public class ChristmasTree {
    public static void printTree(int baseWidth) {
        int topWidth = (baseWidth % 2 == 0) ? 2 : 1;
        // Liczba poziomów
        int levels = ((baseWidth - topWidth) / 2) + 1;

        for (int i = 0; i < levels; i++) {
            int width = topWidth + i * 2;
            int spaces = (baseWidth - width) / 2;

            // Spacje
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            // Znaki choinki
            for (int c = 0; c < width; c++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość znaków w podstawie choinki: ");
        int baseWidth = scanner.nextInt();
        printTree(baseWidth);
    }
}
