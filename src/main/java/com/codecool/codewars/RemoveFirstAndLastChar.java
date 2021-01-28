package com.codecool.codewars;

public class RemoveFirstAndLastChar {
    public static void main(String[] args) {
        System.out.println(remove2("leegouan"));
        String proba="ezlenne";

        System.out.println(proba.substring(1,proba.length()-1));
    }
    public static String remove(String str) {

        String result="";
        for (int i=1; i<str.length()-1;i++){
            result+=str.toCharArray()[i];
        }
        return result;
    }
    public static String remove2(String str) {
        return str.substring(1, str.length() - 1);
    }
}
