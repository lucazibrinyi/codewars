package com.codecool.codewars;

import java.util.ArrayList;
import java.util.List;

public class FindMultiples {
    public static void main(String[] args) {
       int s1=5;
       int s2=13;
       int s3=800;
        ArrayList<Integer> results =new ArrayList<>();

       for(int i=1; i<s3; i++){
           if(i%s1==0 && i%s2==0 && i<=s3){
               results.add(i);
           }
       }
        System.out.println(results);
    }
}
