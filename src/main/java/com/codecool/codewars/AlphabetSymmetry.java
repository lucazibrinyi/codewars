package com.codecool.codewars;

public class AlphabetSymmetry {
    public static void main(String[] args) {
        String[] arr = new String[] {"abode","ABc","xyzD"};
        for (int i=0; i< arr.length; i++) {
            System.out.println(solve(arr).toString());
        }
    }
    public static int[] solve(String[] arr){
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        char[] alphaArr=alphabet.toCharArray();
        int[] result=new int [arr.length];

        for (int l=0; l<arr.length; l++){
            for (int i=0; i<arr[l].length(); i++){
            for(int j=0; j<alphaArr.length; j++){
                if(arr[l].charAt(i)==alphaArr[j] && i==j){

                    result[l]++;
                    }
                }
            }
        }
        return result;

    }
}
