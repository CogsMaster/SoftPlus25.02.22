package com.company;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] price = new int[]{5, 100, 20, 66, 16};
        int discount = 50;
        int offset = 1;
        int readLength = 3;


        Sale bot = new Sale();

        if(discount >= 1 && discount <= 99  && readLength <= (price.length - offset) && offset > 0) {
            System.out.println(Arrays.toString(bot.decryptData(price, discount, offset, readLength)));
        } else System.out.println("Введенные значения не соответствуют условиям \n Скидка от 1% до 90% \n Offset должен быть положительным \n ReadLength не должен привышать длинну массива");



    }
}

