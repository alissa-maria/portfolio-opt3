package com.company;

public class StateZero extends State {

    /* constructor */
    public StateZero(Character character) { super(character); }

    /* resets stats at the end of each turn so stats don't become too high/low */
    public void setAttack() { character.attack = character.baseAttack; }
    public void setDefense() { character.defense = character.baseDefense; }
    public void setSpeed() { character.speed = character.baseSpeed; }
}
