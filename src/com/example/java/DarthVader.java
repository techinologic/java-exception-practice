package com.example.java;

/**
 * Created by Paopao on 08/05/17.
 */
public class DarthVader extends Character {

        String name = "Darth Vader";
        int power = 9482;
        int health = 26610;
        int speed = 121;
        int level = 1;

        int forceCrush_coolDown = 0;

    public void terrifyingSwing(Character character) {
        int damage = 4823;
        character.setHealth(damage-health);
    }
    public void forceCrush(Character character) {
        if (this.forceCrush_coolDown == 0){
            this.forceCrush_coolDown = 5;
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
