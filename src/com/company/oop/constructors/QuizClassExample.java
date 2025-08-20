package com.company.oop.constructors;

public class QuizClassExample {
    int value;

    public void QuizClassExample() {
        value = 4;
    }

    public static void main(String[] args) {
        QuizClassExample quizClassExample = new QuizClassExample();
        System.out.println(quizClassExample.value);
    }
}