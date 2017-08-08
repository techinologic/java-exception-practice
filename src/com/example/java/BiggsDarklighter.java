package com.example.java;

/**
 * Created by Paopao on 08/05/17.
 */
public class BiggsDarklighter extends Character {

    String name = "Biggs Darklighter";
    private int power = 8538;
    private int health = 15656;
    private int speed = 108;
    private int level = 1;

    int specialCoolDown = 0;

    public void cadetsAim(Character character) {
        int damage = 4424;
        character.setHealth(damage-health);
    }
    public void comradeInArms(Character character) {
        if (this.specialCoolDown == 0){
            this.specialCoolDown = 2;
        } else {
            System.out.println("Skill is on cooldown.");
        }
        int damage = 4840;
        character.setHealth(damage-health);
    }

    public boolean inspiringThroughFear(Character character) {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getLevel() {
        return level;
    }
}
