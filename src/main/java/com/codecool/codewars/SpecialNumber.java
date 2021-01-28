package com.codecool.codewars;

public class SpecialNumber {
    public static void main(String[] args) {
        System.out.println(specialNumber(245));
    }
    public static String specialNumber(int number)
    {
        String str=""+number;
        String str2=str.replaceAll("[012345]","");
        if(str2.length()==0){

            return "Special!!";

       }else{
            return "NOT!!";
        }
    }
}
