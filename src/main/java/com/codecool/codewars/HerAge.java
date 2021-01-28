package com.codecool.codewars;

public class HerAge {
    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }
    public static int howOld(final String herOld) {
        //char years=herOld.charAt(0);
        int age = Integer.parseInt(String.valueOf(herOld.charAt(0)));

        return age;
    }
}
