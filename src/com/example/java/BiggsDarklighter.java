package com.example.java;

/**
 * Created by Paopao on 08/05/17.
 */
public class BiggsDarklighter extends Character {

    String name = "Biggs Darklighter";
    int power = 8538;
    int health = 15656;
    int speed = 108;
    int level = 1;

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
}