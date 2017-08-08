package com.example.java;

/**
 * Created by Paopao on 08/05/17.
 */
public class DarthVader extends Character{

    private String name = "Darth Vader";
    private int power = 9482;
    private int health = 26610;
    private int speed = 121;
    private int level = 1;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLevel() {
        return level;
    }

    int forceCrush_coolDown = 0;

    protected int terrifyingSwing(Character character) {
        int damage = 4823;
        return (character.getHealth()-damage);
    }

    public void forceCrush(Character character) {
        if (this.forceCrush_coolDown == 0){
            this.forceCrush_coolDown = 5;
        } else {
            System.out.println("Skill is on cooldown.");
        }
        int damage = 2790;
        character.setHealth(damage-health);
    }
    public int cullingBlade(Character character, int health) {
        int damage = 8256;
        return damage - health;
    }
    public boolean inspiringThroughFear(Character character) {
        return false;
    }
}
