package com.company;

import java.util.Random;

public abstract class Character {
    public State state;

    protected String name;
    protected int health, maxHealth;
    protected int attack, baseAttack;
    protected int defense, baseDefense;
    protected int speed, baseSpeed;

    public Character(String name, int health, int attack, int defense, int speed) {
        this.name = name;
        this.health = health; maxHealth = health;
        this.attack = attack; baseAttack = attack;
        this.defense = defense; baseDefense = defense;
        this.speed = speed; baseSpeed = speed;
    }

    public void attacks(Character otherCharacter) {
        double damage = (int) (this.attack - ((double) otherCharacter.defense/8));
        otherCharacter.health -= damage;
        System.out.println(this.name + " hit " + otherCharacter.name + " and caused " + damage + " HP damage!\n");
    }

    public String checks(Character character) {
        return "NAME: " + character.name +
                "\nHEALTH: " + character.health + "\n";
    }

    public void changeState(State state) {
        this.state = state;
        state.setStats();
    }

    public int getAttack() { return this.attack; }
}
