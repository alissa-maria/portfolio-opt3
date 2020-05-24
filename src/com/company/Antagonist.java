package com.company;

public class Antagonist extends Character {

    /* NOT a singleton, multiple antagonists can enter battle */
    public Antagonist(String name, int health, int attack, int defense, int speed) {
        super(name, health, attack, defense, speed);
    }

    public void epicIntro() throws InterruptedException {
        System.out.println("+------------------------------+");     Thread.sleep(400);
        System.out.println("         A WILD " + this.name    );     Thread.sleep(400);
        System.out.println("           APPEARED!            ");     Thread.sleep(400);
        System.out.println("+------------------------------+\n");   Thread.sleep(2200);
    }

    /* the if statements are okay here right? RIGHT? */
    public String cry() {
        if ((this.maxHealth/2) < this.health) {
            return "*" + this.name + " battle noises*";
        }
        else if ((this.maxHealth/4) < this.health) {
            return "*slightly worried " + this.name + " noises*";
        }
        else if ((this.maxHealth/4) > this.health) {
            return "*panicking " + this.name + " noises*";
        }
        return "";
    }
}
