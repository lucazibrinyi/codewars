package com.codecool.codewars;

import java.util.stream.IntStream;

public class GrassHopper {
    public static void main(String[] args) {
        System.out.println(grassHopper(5));
    }
    public static int grassHopper(int n){
        return IntStream.rangeClosed(1,n).sum();
    }
}
