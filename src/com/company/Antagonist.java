package com.company;

public class Antagonist extends Character {

    /* NOT a singleton, multiple antagonists can enter battle */
    public Antagonist(String name, int health, int attack, int defense, int speed) {
        super(name, health, attack, defense, speed);
    }

    /* the if statements are okay here right? RIGHT? */
    public void cry() {
        if ((this.maxHealth/2) < this.health) {
            System.out.println("*" + this.name + " battle noises*");
        }
        else if ((this.maxHealth/4) < this.health) {
            System.out.println("*" + this.name + " slightly worried noises*");
        }
        else if ((this.maxHealth/4) > this.health) {
            System.out.println("*" + this.name + " panicking noises*");
        }
    }
}
