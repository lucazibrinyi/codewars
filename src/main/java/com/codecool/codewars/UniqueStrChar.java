package com.codecool.codewars;

public class UniqueStrChar {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String a="xyab";
        String b="xzca";

        for(String s : (a+b).split("")){
            if(a.contains(s) ^b.contains(s)){
                sb.append(s);
            }
        }

        System.out.println(sb.toString());
    }
}
