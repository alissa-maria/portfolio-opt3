package com.company;

import java.util.ArrayList;

public class Protagonist extends Character {
    private static Protagonist protagonist = null;

    public ArrayList<Item> items = new ArrayList<>();

    private Protagonist(String name, int health, int attack, int defense, int speed) {
        super(name, health, attack, defense, speed);
    }

    public static Protagonist getInstance() {
        if (protagonist == null) {
            protagonist = new Protagonist("CHARMANDER", 60, 22, 24, 24);
        }
        return protagonist;
    }

    public void useItem(Item item) {
        if (item instanceof ItemBerry) {
            ItemBerry berry = (ItemBerry) item; // casting
            if (this.health == maxHealth) {
                System.out.println("Your HP is already at maximum!\n");
                return; // item won't be used
            }
            this.health += berry.healPower;
            if (this.health >= maxHealth) {
                System.out.println("Your HP is maxed out!\n");
                this.health = maxHealth;
            }
            else {
                System.out.println("You used the " + berry.name + " and got healed with " + berry.healPower + " HP.\n");
            }
            this.items.remove(item);
        }
    }
}
