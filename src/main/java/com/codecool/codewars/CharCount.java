package com.codecool.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        System.out.println(charCount("fizzbuzz", 'z'));
    }
    public static int charCount(String str, char c) {
        int result=0;
        String s=""+c;
        for(int i=0; i<str.length(); i++){
            if(str.toLowerCase().toCharArray()[i]==s.toLowerCase().charAt(0)){
                result++;
            }
        }
            return result;
    }
    //with regex
    public static int charCount2(String str, char c) {
        return str.toUpperCase().
                replaceAll("[^"+Character.toUpperCase(c)+"]", "")
                .length();
    }
    //with stream1
    static int charCount3(String str, char c) {
        return (int) str.toLowerCase().chars().
                filter(i -> i == Character.toLowerCase(c)).count();
    }
    public static int charCount4(String str, char c) {

        long total=str.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .filter((l)->l== Character.toLowerCase(c))
                .count();

        return (int) total;

}
}
