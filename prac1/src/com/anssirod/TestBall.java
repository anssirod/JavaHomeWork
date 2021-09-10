package com.anssirod;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(23, "Pink");
        System.out.println(b1);
        b1.jump();
        Ball b2 = new Ball(56, "Red");
        System.out.println(b2);
    }
}
