package com.anssirod;

public class TestAuthor {

    public static void main(String[] args) {
        Author a1 = new Author("Danila", "test@mail.ru", 'm');
        a1.setEmail("anssirod@gmail.com");
        System.out.println(a1.getGender());
        System.out.println(a1);
    }
}
