package com.codecool.codewars;

import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        double[] arr={ 1, 1, 1, 2, 1, 1 };
        System.out.println(findUniq(arr));
    }
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return (arr[0]==arr[1])?arr[arr.length-1] : arr[0];
    }
}
