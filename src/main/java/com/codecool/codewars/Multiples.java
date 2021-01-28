package com.codecool.codewars;

public class Multiples {
    public static void main(String[] args) {
        multiples(0, 5);

    }
    public static int[] multiples(int m, int n) {
        int[] arr =new int[m];

        for(int i=0; i<m; i++){
//            if(i>0){
//                arr[i]=arr[i-1]+n;
//            } else{
//                arr[i]=n;
//            }
            arr[i]=(i+1)*n;
        }
        return arr;
    }
}
