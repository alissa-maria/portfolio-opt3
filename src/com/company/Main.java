package com.company;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.exit;

public class Main {

    Protagonist protagonist = Protagonist.getInstance();
    Antagonist antagonist = new Antagonist("PIKACHU", 32, 20, 10, 26);

    Menu protagonistChoice = new Menu();

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.game();
    }

    public void game() throws InterruptedException {
        protagonist.items.add(new ItemBerry("BERRY", 20));
        antagonist.epicIntro();

        /* when one of the two dies, the program exits (see the turn methods) */
        while(true) {
            protagonistChoice.strategyMenu(antagonist);

            /* speed (influenced by strategy) determines who goes first */
            if (protagonist.speed >= antagonist.speed) { protagonistTurn(); antagonistTurn(); }
            else if (protagonist.speed < antagonist.speed) { antagonistTurn(); protagonistTurn(); }

            protagonist.changeState(new StateZero(protagonist));
        }
    }

    public void protagonistTurn() throws InterruptedException {
        protagonistChoice.mainMenu(antagonist); Thread.sleep(1000);
        if (antagonist.health <= 0) { System.out.println("You've won!"); exit(0); }
    }

    public void antagonistTurn() throws InterruptedException {
        System.out.println(antagonist.cry()); Thread.sleep(1000);
        antagonist.attacks(protagonist); Thread.sleep(1000);
        if (protagonist.health <= 0) { System.out.println("You died. Try again?"); exit(0); }
    }
}
