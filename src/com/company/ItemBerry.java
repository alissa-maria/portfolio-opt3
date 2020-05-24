package com.company;

public class ItemBerry extends Item {
    protected int healPower;

    public ItemBerry(int ID, int healPower) {
        super(ID);
        this.healPower = healPower;
    }
}
