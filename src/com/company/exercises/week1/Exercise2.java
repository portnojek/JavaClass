package com.company.exercises.week1;
//variables
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        length();
        join();
        rename();
        ifJava();
        compare();
        cutOff();

    }

    private static void length() {
        Scanner word = new Scanner(System.in);
        String userWord = word.nextLine();
        System.out.println(userWord.length());
        word.close();
    }

    private static void join() {
        String name = "Bartek";
        String surname = "Kocięcki";
        String age = "41";
        String city = "Wroclaw";
        String country = "Poland";

        System.out.println(name + " " + surname + " " + age + " " + city + " " + country);
        System.out.println(name.concat(surname).concat(age).concat(city).concat(country));

    }

    static double voice = 2.3;
    static String sentence = "Nie ma jak u mamy";

    private static void rename() {
        String replaced = sentence.replaceAll("(?i)[aeiouyąęó]", String.valueOf(voice));
        System.out.println(replaced);

    }

    private static void ifJava() {
        String javaSentence = "Nie ma jak u Javy. JavaJava";
        boolean findJava = javaSentence.contains("Java");
        if (findJava == true) {
            System.out.println("There is a Java word in sentence");
        } else {
            System.out.println("There are no word Java in sentence");
        }
    }
    private static void compare(){
        String lang = "Java";
        String lang2 = "jaVa";
        System.out.println(lang.equalsIgnoreCase(lang2));
    }
    private static void cutOff(){
        String toCutOff = "SomeStringLongerThan10Signs";
        if(toCutOff.length() > 10){
            System.out.println(toCutOff.substring(3, 8));
        }
    }

}
