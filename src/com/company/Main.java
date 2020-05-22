package com.company;

public class Main {

    public static void main(String[] args) {
        initialise();
    }

    public static void initialise() {
        Protagonist protagonist = Protagonist.getInstance();
        Antagonist antagonist = new Antagonist("Charmander", 40, 28, 30, 16);
    }
}
