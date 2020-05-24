package com.company;

public class ItemLeaf extends Item{
    protected int attackRaise;

    public ItemLeaf(String name, int attackRaise) {
        super(name);
        this.attackRaise = attackRaise;
    }

    public String toString() {
        return "This leaf raises your attack for some reason.";
    }
}
