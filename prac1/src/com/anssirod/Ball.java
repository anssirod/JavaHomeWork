package com.anssirod;

public class Ball {
    private double radius;
    private String color;

    public Ball(double r, String c) {
        radius = r;
        color = c;
    }

    public void jump() {
        System.out.println("Ball is jumping");
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

    public String toString() {
        return "Radius: " + this.radius + ", Color: " + this.color;
    }
}
