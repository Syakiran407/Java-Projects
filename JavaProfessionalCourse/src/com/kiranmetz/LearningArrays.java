package com.kiranmetz;

import java.util.Arrays;

public class LearningArrays {

    public static void main (String [] args) {

        double [] values = new double[100];
        values[0] = 1000;
        values[1] = 2000;
        values[99] = 9999;
        System.out.println(Arrays.toString(values));
        System.out.println(values[1]);

        String [] words = new String[3];
        words[0] = "Hello";
        words[1] = "World";

    }
}
