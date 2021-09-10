package com.anssirod;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Граф Монте-Кристо", 300);
        b1.read();
        System.out.println(b1);

        Book b2 = new Book("Три Мушкетера", 900);
        b2.read();
        System.out.println(b2);
    }
}
