package org.example.Day1;

public class Day1 {

    int count = 0;
    int dial = 50;
    public static int newPosition(int dial, String rotation){
        char direction = rotation.charAt(0);
        int newDial = 50;
        int move = Integer.parseInt(rotation.substring(1));
        switch (direction) {
            case 'L':
                newDial = Math.floorMod(dial - move, 100);
                break;
            case 'R':
                newDial = Math.floorMod(dial + move, 100);
                break;
        }
        return newDial;
    }

    public static int[] newPositionCountZero(int dial, String rotation){
        char direction = rotation.charAt(0);
        int newDial = 50;
        int move = Integer.parseInt(rotation.substring(1));
        int passZero = 0;
        if (move >= 100) {
            passZero += 1;
        } if (move >= 200) {
            passZero += 1;
        } if (move >= 300) {
            passZero += 1;
        } if (move >= 400) {
            passZero += 1;
        } if (move >= 500) {
            passZero += 1;
        } if (move >= 600) {
            passZero += 1;
        } if (move >= 700) {
            passZero += 1;
        } if (move >= 800) {
            passZero += 1;
        } if (move >= 900) {
            passZero += 1;
        }
        switch (direction) {
            case 'L':
                newDial = Math.floorMod(dial - move, 100);
                if (newDial > dial && newDial != 0 && dial != 0) {
                    passZero += 1;
                }
                break;
            case 'R':
                newDial = Math.floorMod(dial + move, 100);
                if (newDial < dial && newDial != 0 && dial != 0) {
                    passZero += 1;
                }
                break;
        }
        return new int[] {newDial, passZero};
    }
}


