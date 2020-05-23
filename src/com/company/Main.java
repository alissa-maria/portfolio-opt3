package com.company;

public class Main {

    public static void main(String[] args) {
        Protagonist protagonist = Protagonist.getInstance();
        Antagonist antagonist = new Antagonist("Charmander", 40, 28, 30, 16);

        System.out.println(protagonist.attack);
        protagonist.changeState(new StateOffense(protagonist));

        System.out.println(protagonist.attack);
    }

    public static void initialise() {

    }
}
