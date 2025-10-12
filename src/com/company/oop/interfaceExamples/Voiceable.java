package com.company.oop.interfaceExamples;

public interface Voiceable {
// wszystkie metody w interface są domyślnie publiczne i abstrakcyjne
    String gimmeVoice();

    default void sing(String songName){
        System.out.println("Default singing songname: " + songName);
        singMeSongWithName("private song");
    }

    private void singMeSongWithName(String songName){
        System.out.println("Private singing songname: " + songName);
    }

    Integer metghod3(String argument1, String argument2);
}
