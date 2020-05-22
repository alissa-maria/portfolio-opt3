package com.company;

public class Protagonist extends Character {

    /* singleton, there can only be one player */
    private static Protagonist protagonist = null;

    private Protagonist(String name, int health, int attack, int defense, int speed) {
        super(name, health, attack, defense, speed);
    }

    public static Protagonist getInstance() {
        if (protagonist == null) {
            protagonist = new Protagonist("Pikachu", 32, 20, 10, 26);
        }
        return protagonist;
    }

    public void attacks() {

    }

    public void checks(Character character) {

    }
}
