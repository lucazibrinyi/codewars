package com.codecool.codewars;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("macilaci"));
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vowel={'a','e', 'i','o','u'};
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<vowel.length; j++){
                if(str.charAt(i)==vowel[j]){
                    vowelsCount++;
                }
            }

        }
            return vowelsCount;
    }
    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
    public static int getCount3(String str) {
        return str.replaceAll("[^aeiou]","").length();
    }
}
