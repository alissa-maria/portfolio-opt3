package com.company;

public class Main {

    public static void main(String[] args) {
        Protagonist protagonist = Protagonist.getInstance();
        Antagonist antagonist = new Antagonist("Charmander", 40, 28, 30, 16);

        System.out.println(protagonist.attack);
        StateOffense ugh = new StateOffense(protagonist);
        protagonist.changeState(ugh);
        protagonist.getState().setStats();
        System.out.println(protagonist.attack);
    }

    public static void initialise() {

    }
}
