package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Protagonist protagonist = Protagonist.getInstance();
        Antagonist antagonist = new Antagonist("CHARMANDER", 40, 22, 24, 16);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(protagonist);
        characters.add(antagonist); /* initialise protagonists and antagonists */

        Menu protagonistChoice = new Menu();

        antagonist.epicIntro();

        while(protagonist.health > 0) {

            protagonistChoice.mainMenu(antagonist);
            antagonist.attacks(protagonist);

            protagonist.changeState(new StateZero(protagonist));

            if (antagonist.health <= 0) { System.out.println("You've won!"); }
        }

    }
}
