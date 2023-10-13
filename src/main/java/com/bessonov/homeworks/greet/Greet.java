package com.bessonov.homeworks.greet;

public class Greet {
    private String greetings() {
        return "Hello\nWorld\nfrom\nJava";
    }

    public void printGreetings() {
        System.out.println(greetings());
    }
}