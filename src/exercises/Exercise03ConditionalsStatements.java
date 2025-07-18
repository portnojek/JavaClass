package exercises;

//operators
public class Exercise03ConditionalsStatements {
    public static void main(String[] args) {

        calculator(3.5, 5.6);
        operators();
        isDivided(7);
        pencils();
        typePromotion();

    }

    private static void calculator(double firtNumber, double secondNumber) {

        double addition = firtNumber + secondNumber;
        double subtraction = firtNumber - secondNumber;
        double multiplication = firtNumber * secondNumber;
        double division = firtNumber / secondNumber;
        System.out.println("Addition is: " + addition);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Multiplcation is: " + multiplication);
        System.out.println("Division is: " + division);

    }

    private static void operators() {
        int x = 0;
        if (x == 0) {
            System.out.println("x jest równe 0");
        }
        if (!(x != 0)) {
            System.out.println("x nie jest różne od 0");
        }
        x++;
        System.out.println("x zwiekszone o 1: " + x);

        x *= 5;
        System.out.println("x pomnozone przez 5: " + x);

        x -= 3;
        System.out.println("x zmiejszone o 3: " + x);

        if (x != 0) {
            System.out.println("x jest rózne od 0 i wynosi: " + x);
        }
    }

    private static void pencils() {

        int kreska = 100;
        int index = (kreska - 1) % 6;
        if (index == 0) {
            System.out.println("czerwony");
        }
        if (index == 1) {
            System.out.println("zielony");
        }
        if (index == 2) {
            System.out.println("niebieski");
        }
        if (index == 3) {
            System.out.println("czarny");
        }
        if (index == 4) {
            System.out.println("zółty");
        }
        if (index == 5) {
            System.out.println("brązowy");
        }
    }

    private static void isDivided(int number) {
        if (number % 3 == 0 && number % 7 == 0) {
            System.out.println("Liczba podzielna przez 3 i 7");
            return;
        }
        if (number % 3 == 0) {
            System.out.println("Liczba podzielna przez 3");
            return;
        }
        if (number % 7 == 0) {
            System.out.println("Liczba podzielna przez 7");
        }
    }
    private static void typePromotion(){
        byte x = 0;
        System.out.println((double) (float) (long) (int)x);
    }

}
