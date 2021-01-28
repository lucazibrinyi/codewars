package com.codecool.codewars;

public class Monogram {
    public static void main(String[] args) {
        System.out.println(abbrevName("Luca Zibrinyi"));
    }
    public static String abbrevName(String name) {

        String monogram=""+name.charAt(0)+".";
        name.toCharArray();
        for(int i=0; i<name.length(); i++ ) {
            if(name.toCharArray()[i]==' '){
                monogram+=name.toCharArray()[i+1];
            }
        }
        monogram.toUpperCase();
        return monogram;
    }
    public static String abbrevName2(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
    public static String abbrevName3(String name) {
        name = name.toUpperCase();
        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
    }
}
