package com.codecool.codewars;

import java.util.Arrays;

public class ArrayElementParity {
    public static void main(String[] args) {
        int [] arr= {-110,110,-38,-38,-62,62,-38,-38,-38};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){

        return Arrays.stream(arr).distinct().sum();
    }
}
