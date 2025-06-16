package com.company.animal;

public class Cat {

   public Cat(String color, String color2){
       this.color = color;
       this.color2 = color2;
   }

    String cat_voice = "meow";

    public String color;
    public String color2;

    public void catVoice(){
        System.out.println("Voice od cat is: " + cat_voice);
    }
}
