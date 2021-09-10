package com.anssirod;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

