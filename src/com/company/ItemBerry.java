package com.company;

public class ItemBerry extends Item {
    protected int healPower;

    public ItemBerry(String name, int healPower) {
        super(name);
        this.healPower = healPower;
    }

    @Override
    public String toString() {
        return "This fresh berry restores " + healPower + " HP when eaten.";
    }
}
