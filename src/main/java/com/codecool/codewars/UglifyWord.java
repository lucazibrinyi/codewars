package com.codecool.codewars;

public class UglifyWord {
    public static void main(String[] args) {
        System.out.println(uglifyWord("helloka"));
    }
    public static String uglifyWord(String str) {
        String res="";
        char[] chars=str.toCharArray();
        for(int i=0; i<str.length(); i++)
            if(i==0 || i%2==0){
                res+=""+str.toUpperCase().charAt(i);
                }else{
                res+=""+str.toLowerCase().charAt(i);
            }
        return res;
    }
}
