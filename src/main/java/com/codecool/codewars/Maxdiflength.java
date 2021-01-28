package com.codecool.codewars;

public class Maxdiflength {
    public static void main(String[] args) {
        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        System.out.println(mxdiflg(a1, a2));
    }
    public static int mxdiflg(String[] a1, String[] a2) {
        int mina1Length=0;
        int maxa1Length=0;

        int mina2Length=0;
        int maxa2Length=0;

        for (int i=0; i<a1.length; i++){
            if(a1[i].length()>maxa1Length){
                maxa1Length=a1[i].length();
            }else if(a1[i].length()<mina1Length){
                mina1Length=a1[i].length();
            }
        }
        for (int i=0; i<a2.length; i++){
            if(a2[i].length()>maxa2Length){
                maxa2Length=a2[i].length();
            }else if(a2[i].length()<mina2Length){
                mina2Length=a2[i].length();
            }
        }
        return (Math.abs(mina1Length-maxa2Length)>Math.abs(maxa1Length-mina2Length)?Math.abs(mina1Length-maxa2Length):Math.abs(maxa1Length-mina2Length));

    }
}
