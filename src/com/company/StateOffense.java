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

    }

    public void setSpeed() {

    }

}
