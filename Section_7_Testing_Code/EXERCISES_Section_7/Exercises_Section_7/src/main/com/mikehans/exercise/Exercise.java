package com.mikehans.exercise;

public class Exercise {

    public String alternateCapMaker (String input) {
        char[] convert = input.toCharArray();
        for (int i = 0; i < convert.length; i++) {
            if(i % 2 == 1) {
                convert[i] = Character.toUpperCase(convert[i]);
            } else {
                convert[i] = Character.toLowerCase(convert[i]);
            }
        }
        return String.valueOf(convert);
    }


    public static void main(String[] args) {
//        Exercise ex1 = new Exercise();
//        System.out.println(ex1.alternateCapMaker("apple"));
    }
}
