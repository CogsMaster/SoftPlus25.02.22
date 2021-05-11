package com.company;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] price = new int[]{5, 100, 20, 66, 16};
        int discount = 23;
        int offset = 1;
        int readLength = 3;

        Sale bot = new Sale();
        System.out.println(Arrays.toString(bot.decryptData(price, discount, offset, readLength)));


    }
}

