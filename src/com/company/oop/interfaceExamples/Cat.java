package com.company.oop.interfaceExamples;

public class Cat implements CatStrokeable, Voiceable {
    @Override
    public void beStroked() {
        System.out.println("Cat is being stroked");
    }

    @Override
    public String gimmeVoice() {
        return "meow";
    }

//    @Override
//    public void sing(String songName) {
//        System.out.println("Cat is singing: " + songName);
//    }

    @Override
    public Integer metghod3(String argument1, String argument2) {
        return 0;
    }
}
