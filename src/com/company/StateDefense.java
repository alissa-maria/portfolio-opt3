package com.company;

public class StateDefense extends State {

    /* constructor */
    public StateDefense(Character character) {
        super(character);
    }

    public void setAttack() { }

    public void setDefense() {
        double newDefense = (character.defense * 1.2);
        character.defense = (int) newDefense;
    }

    public void setSpeed() {
        double newSpeed = (character.speed * 0.8);
        character.speed = (int) newSpeed;
    }
}
