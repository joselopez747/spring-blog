package com.codeup.springblog.models;

public class Dice {
    private int roll1;
    private int roll2;
    private int roll3;
    private int roll4;
    private int roll5;
    private int roll6;

    public Dice(){
    }

    public Dice(int roll1, int roll2, int roll3, int roll4, int roll5, int roll6) {
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.roll3 = roll3;
        this.roll4 = roll4;
        this.roll5 = roll5;
        this.roll6 = roll6;
    }

    public Dice(int n) {

    }


    public int getRoll1() {
        return roll1;
    }

    public void setRoll1(int roll1) {
        this.roll1 = roll1;
    }

    public int getRoll2() {
        return roll2;
    }

    public void setRoll2(int roll2) {
        this.roll2 = roll2;
    }

    public int getRoll3() {
        return roll3;
    }

    public void setRoll3(int roll3) {
        this.roll3 = roll3;
    }

    public int getRoll4() {
        return roll4;
    }

    public void setRoll4(int roll4) {
        this.roll4 = roll4;
    }

    public int getRoll5() {
        return roll5;
    }

    public void setRoll5(int roll5) {
        this.roll5 = roll5;
    }

    public int getRoll6() {
        return roll6;
    }

    public void setRoll6(int roll6) {
        this.roll6 = roll6;
    }

}
