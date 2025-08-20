package com.company.oop.overriding;

public class SubClass extends SuperClass{

//    public String publicMethod() {
//        return "public method";
//    }

    private String privateMethod() {
        return "private method";
    }

    String defaultMethod() {
        return "default method";
    }

    protected String protectedMethod() {
        return "protected method";
    }
}
