package com.codecool.codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class Drinking {
    public static void main(String[] args) {
        System.out.println(hydrate("1 beer, 3 shots"));
    }
    public static String hydrate(String drinkString) {
        int result;
        result= Arrays.stream(drinkString.replaceAll("[^\\d]","")
                    .trim()
                    .split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();
        return result+(result==1 ? " glass": " glasses")+" of water";
    }
}
