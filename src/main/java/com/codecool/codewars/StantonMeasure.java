package com.codecool.codewars;

public class StantonMeasure {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        int sum1 = 0;
        int sum2 = 0;
        for(int i : arr){
            if(i == 1)
                sum1++;
        }
        for(int i : arr){
            if (i == sum1)
                sum2++;
        }
        System.out.println(sum2);
    }
}