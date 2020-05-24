package com.company;

import java.util.ArrayList;

public class Protagonist extends Character {
    private static Protagonist protagonist = null;

    ArrayList<Item> items = new ArrayList<>();

    private Protagonist(String name, int health, int attack, int defense, int speed) {
        super(name, health, attack, defense, speed);
    }

    public static Protagonist getInstance() {
        if (protagonist == null) {
            protagonist = new Protagonist("PIKACHU", 32, 20, 10, 26);
        }
        return protagonist;
    }

    public void useItem(Item item) {

    }

//    public String checks(Character character) {
//        return "bruh";
//    }
}
