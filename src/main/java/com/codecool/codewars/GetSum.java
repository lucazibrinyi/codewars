package com.codecool.codewars;

public class GetSum {
    public static void main(String[] args) {

    }
    public int GetSum(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        } else {
            int min;
            int max;
            if (a < b) {
                min = a;
                max = b;
            } else {
                min = b;
                max = a;
                for (int i = 0; i < max - min; i++) {
                    sum += min;
                    min++;
                }}
                return sum;
            }
        }
    }
