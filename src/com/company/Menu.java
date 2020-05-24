package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Protagonist protagonist = Protagonist.getInstance();


    public void strategyMenu(Antagonist antagonist) throws InterruptedException {
        System.out.println(protagonist.name + ", what strategy will you pick this turn?\n");
        Thread.sleep(1000);
        System.out.println( "1) OFFENSIVE\n" +
                "2) DEFENSIVE\n" +
                "3) AGILE\n");

        int input = getInput(3);
        switch (input) {
            case 1: protagonist.changeState(new StateOffense(protagonist)); break;
            case 2: protagonist.changeState(new StateDefense(protagonist)); break;
            case 3: protagonist.changeState(new StateSpeed(protagonist)); break;
        }
    }

    public void mainMenu(Antagonist antagonist) throws InterruptedException {
        System.out.println("What will you do?\n");
        Thread.sleep(1000);
        System.out.println("1) ATTACK\n" +
                "2) USE ITEM\n" +
                "3) CHECK STATS\n" +
                "4) CHECK ENEMY\n");

        int input = getInput(4);
        switch(input) {
            case 1: protagonist.attacks(antagonist); break;
            case 2: itemMenu(antagonist); break;
            case 3: protagonist.checks(protagonist); break;
            case 4: protagonist.checks(antagonist); break;
        }
    }

    public void itemMenu(Antagonist antagonist) throws InterruptedException {
        int i;
        for (i = 0; i< protagonist.items.size(); i++) {
            System.out.println(i+1 + ") " + protagonist.items.get(i));
        }
        System.out.println(i+1 + ") (GO BACK)\n");

        int choices = protagonist.items.size()+1;
        int answer = getInput(choices);
        if (answer == choices) {
            mainMenu(antagonist);
        }
        else {
            protagonist.useItem(protagonist.items.get(answer-1));
        }
    }


    private int getInput(int choices) {
        Scanner sc = new Scanner(System.in);
        int input = -1;
        while (input < 0 || input > choices) {
            try {
                input = Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e) {
                System.out.println("Enter a number from the list!\n");
            }
        }
        return input;
    }
}
