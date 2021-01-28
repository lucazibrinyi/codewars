package com.codecool.codewars;

public class MaxMultiple {
    public static void main(String[] args) {
        System.out.println(maxMultiple(2,7));
    }
    public static int maxMultiple(int divisor, int bound) {
        int result=0;
        for (int i=bound; i>=divisor; i--){
            if(i%divisor==0){
                result=i;
                break;
            }
        }
        return result;
    }
}
