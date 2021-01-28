package com.codecool.codewars;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println(GetSum(0,1));
    }
    public static int GetSum(int a, int b)     {
        int res = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            res += i;
        }
        return a == b ? a : res;
        }

}
