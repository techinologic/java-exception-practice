package com.example.java;

import java.util.Calendar;
import java.util.Stack;

public class Main {

    static final int meter = 1000;
    static int char1Meter = 1000;
    static int char2Meter = 1000;

    // method to determine which character will do turn
    public static Character turn(Character character1, Character character2) {
        int i = 0;
        int char1turn = 0;
        int char2turn = 0;

        char1turn = meter / character1.getSpeed();
        char1Meter += character1.getSpeed() % meter;

        char2turn = meter / character2.getSpeed();
        char2Meter += character2.getSpeed() % meter;

        if (char1turn == char2turn) {
            if ((character1.getSpeed() % meter) < (character2.getSpeed() % meter)) {
                return character1;
            } else {
                return character2;
            }
        } else if (char1turn < char2turn){
            return character1;
        } else {
            return character2;
        }
    }

    public static void main(String[] args) {

        Character darthVader = new DarthVader();
        Character biggsDarklighter = new BiggsDarklighter();

        DarthVader tempDarth = (DarthVader) darthVader;
                tempDarth.terrifyingSwing(biggsDarklighter);

        System.out.println(turn(darthVader, biggsDarklighter).getName()
                + " will make a turn");
        System.out.println(biggsDarklighter.getHealth());
        System.out.println(darthVader.getHealth());



    }
}
