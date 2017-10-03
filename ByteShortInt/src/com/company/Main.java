package com.company;

public class Main {

    public static void main(String[] args) {

        //has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        //has a width of 8
        byte byteValueMin = -128;
        byte byteValueMax = 127;

        //has a width of 16
        short myMinValueShort = -32768;
        short myMaxValueShort = 32767;

        //has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        System.out.println(myMinValue + " ___ " + myMaxValue);
        System.out.println(byteValueMin + " ___ " + byteValueMax);
        System.out.println(myMinValueShort + " ___ " + myMaxValueShort);
        System.out.println(myMinLongValue + " ___ " + myMaxLongValue);

    }
}
