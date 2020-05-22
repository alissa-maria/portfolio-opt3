package com.company;

public abstract class Character {
    private String name;
    private int health;
    private int maxHealth;

    private int attack;
    private int defense;
    private int speed;

    public Character(String name, int health, int attack, int defense, int speed) {
        this.name = name;
        this.health = health;
        maxHealth = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public abstract void attacks();
    public String checks(Character character) {
        return "NAME: " + character.getName() +
                "\nHEALTH: " + character.getHealth() + "\n";
    }

    /* getters to keep everything private */
    public String getName() { return this.name; }
    public int getHealth() { return this.health; }
    public int getMaxHealth() { return this.maxHealth; }
    public int getAttack() { return this.attack; }
    public int getDefense() { return this.defense; }
    public int getSpeed() { return this.speed; }

    /* setters, only for necessary variables */
    public void setHealth(int health) { this.health = health; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setSpeed(int speed) { this.speed = speed; }
}
