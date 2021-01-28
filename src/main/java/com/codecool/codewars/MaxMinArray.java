package com.codecool.codewars;

import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr={15,11,10,7,12};
        int[] nA=solve(arr);
        for(int i=0; i< arr.length;i++) {
            System.out.println(nA[i]);
        }
        }
    public static int[] solve (int[] arr){
        int length = arr.length;
        int lastIndex = length - 1;
        int[] output = new int[length];

        Arrays.sort(arr);
        int counter = 0;
        int i = 0;
        int j = lastIndex;

        while (counter < length)
        {
            if(counter % 2 == 0) //If counter is even
            {
                output[counter] = arr[j];
                --j;
            }
            if(counter %2 != 0)
            {
                output[counter] = arr[i];
                ++i;
            }
            ++counter;
        }

        return output;
    }
}
