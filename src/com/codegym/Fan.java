package com.codegym;

public class Fan {
    int Slow = 1;
    int Medium = 2;
    int Fast = 3;
    private int Speed = 1;
    private boolean ON = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return Slow;
    }

    public void setSlow(int slow) {
        Slow = slow;
    }

    public int getMedium() {
        return Medium;
    }

    public void setMedium(int medium) {
        Medium = medium;
    }

    public int getFast() {
        return Fast;
    }

    public void setFast(int fast) {
        Fast = fast;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isON() {
        return ON;
    }

    public void setON(boolean ON) {
        this.ON = ON;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public Fan(int Speed, boolean ON, double radius, String color) {
        this.Speed = Speed;
        this.ON = ON;
        this.radius = radius;
        this.color = color;
    }


    @Override
    public String toString() {
        String state = "";
        if (this.ON) {
            state += ("Fan is on"+"\n");
            state += ("Speed: " + this.Speed + "\n");
            state += ("Color: " + this.color + "\n");
            state += ("Radius: " + this.radius + "\n");
        } else {
            state += ("Fan is off"+"\n");
            state += ("Color: " + this.color + "\n");
            state += ("Radius: " + this.radius + "\n");
        }
        return state;
    }
}
