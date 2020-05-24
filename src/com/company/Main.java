package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Protagonist protagonist = Protagonist.getInstance();
        Antagonist antagonist = new Antagonist("Charmander", 40, 22, 24, 16);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(protagonist);
        characters.add(antagonist); /* initialise protagonists and antagonists */

        Menu menu = new Menu();

        System.out.println(protagonist.attack);
        protagonist.changeState(new StateSpeed(protagonist));

        System.out.println(protagonist.attack);

//        System.out.println(antagonist1.health);
//        protagonist.attacks(antagonist1);
//        System.out.println(antagonist1.health);

        protagonist.changeState(new StateZero(protagonist));

    }

    public static void initialise() {

    }
}
