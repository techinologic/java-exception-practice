package com.example.java;

import java.util.Calendar;
import java.util.Stack;

public class Main {

    static final int meter = 1000;
    static int char1Meter = 1000;
    static int char2Meter = 1000;

    // method to determine which character will do turn
    public static Object turn(DarthVader character1, BiggsDarklighter character2) {
        int i = 0;
        int char1turn = 0;
        int char2turn = 0;

        char1turn = character1.getSpeed() / meter;
        char1Meter += character1.getSpeed() % meter;

        char2turn = character2.getSpeed() / meter;
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

        DarthVader darthVader = new DarthVader();
        BiggsDarklighter biggsDarklighter = new BiggsDarklighter();

        String turnCharName = (turn(darthVader, biggsDarklighter).getName());

        System.out.println(turnCharName + " will make a turn.");

    }
}
