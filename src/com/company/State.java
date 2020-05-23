package com.company;

public abstract class State {
    public Character character;

    public State(Character character) {
        this.character = character;
    }

    public void setStats() {
        character.getState().setAttack();
        character.getState().setDefense();
        character.getState().setSpeed();
    }

    public abstract void setAttack();
    public abstract void setDefense();
    public abstract void setSpeed();
}
