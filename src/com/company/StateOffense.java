package com.company;

public class StateOffense extends State {
    public StateOffense(Character character) {
        super(character);
    }

    public void setAttack() {
        double newAttack = (character.attack * 1.2);
        character.attack = (int) newAttack;
    }

    public void setDefense() {
        double newDefense = (character.defense * 0.8);
        character.defense = (int) newDefense;
    }

    public void setSpeed() { }
}
