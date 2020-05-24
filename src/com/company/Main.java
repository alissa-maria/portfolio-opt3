package com.company;

public class Main {

    public static void main(String[] args) {
        Protagonist protagonist = Protagonist.getInstance();
        Antagonist antagonist1 = new Antagonist("Charmander", 40, 28, 30, 16);
        Antagonist antagonist2 = new Antagonist("Pidgey", 34, 30, 24, 38);

        System.out.println(protagonist.attack);
        protagonist.changeState(new StateSpeed(protagonist));

        System.out.println(protagonist.attack);
    }

    public static void initialise() {

    }
}
