package com.codecool.codewars;

public class MultiTable {
    public static void main(String[] args) {
        String s = "";
        int num=6;
        for (int i=1; i<11; i++) {
            if (i<10){
                s = s +(i+" * "+num + " = " + i*num+"\n");
            }else {
                s = s +(i+" * "+num + " = " + i*num);
            }
        }
        System.out.println(s);
    }
}
