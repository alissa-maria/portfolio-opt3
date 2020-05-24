package com.company;

public class StateSpeed extends State {

    /* constructor */
    public StateSpeed(Character character) {
        super(character);
    }

    public void setAttack() {
        double newAttack = (character.attack * 0.8);
        character.attack = (int) newAttack;
    }

    public void setDefense() { }

    public void setSpeed() {
        double newSpeed = (character.speed * 1.2);
        character.speed = (int) newSpeed;
    }
}
