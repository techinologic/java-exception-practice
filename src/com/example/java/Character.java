package com.example.java;

/**
 * Created by Paopao on 08/05/17.
 */
public class Character {
    private String name;
    private int power;
    private int health;
    private int speed;
    private int level;

    Character(){
        this.name = name;
        this.power = power;
        this.health = health;
        this.speed = speed;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
