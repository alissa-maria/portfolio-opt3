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
//        Random r = new Random();
//        int min = character.getAttack()/2; int max = character.getAttack();
//        int damage = r.nextInt(max-min+1) + min;
        int damage = this.attack;
        otherCharacter.health -= damage;
        System.out.println(this.name + " hit " + otherCharacter.name + " and caused " + damage + " Hit Points damage!\n");
    }

    public String checks(Character character) {
        return "NAME: " + character.name +
                "\nHEALTH: " + character.health + "\n";
    }

    public void changeState(State state) {
        this.state = state;
        state.setStats();
    }
}
