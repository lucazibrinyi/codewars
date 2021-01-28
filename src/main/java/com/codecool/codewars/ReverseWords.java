package com.codecool.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        //System.out.println(reverseWords("Ez a megfordítandó szöveg"));
        //System.out.println(reverseWords2("Ez a megfordítandó szöveg"));
        System.out.println(reverseWords3("Ez a megfordítandó szöveg"));
    }
    public static String reverseWords(String str){
        String[] str2 = str.split(" ");

            System.out.println(Arrays.toString(str2));

        String fin = "";
        for(int i=str2.length-1;i>=0;i--){
            fin += str2[i];
            if(i>0)fin+=" ";
        }
        return fin;
    }

    public static String reverseWords2(String str){

        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }

    public static String reverseWords3(String str){
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }
}
