package com.company;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;


public class Sale {


    public @Nullable float[] decryptData(@NonNull int[] price,
                                       @IntRange(from = 1) int discount,
                                       @IntRange(from = 0) int offset,
                                       @IntRange(from = 1) int readLength) {



        float[] newArr = new float[readLength];
        int j = 0;
        for(int i = offset; i <= offset + readLength - 1 ; i++) {
            newArr[j] = (float) price[i] - ((float) price[i] * ((float) discount / 100));
            j++;
        }


        return newArr;
    }


}

