package com.company.animal;

class Greeter {
  // Give the correct type to the argument of the method
  static void specificGreeter(String name) {
    // Call the correct variable given as an argument to the method
    System.out.println("Nice day to you, " + name + "!");
  }

  public static void main(String[] args) {
    String firstName = "Caleb";
    specificGreeter(firstName);
  }
}