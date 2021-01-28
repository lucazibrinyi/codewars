package com.codecool.codewars;

public class tidyNumbers {
    public static void main(String[] args) {
        System.out.println(tidyNumber(13579));
    }
    public static boolean tidyNumber(int number){
        String num=""+number;
        char[] nums=num.toCharArray();
        int i=0;
        while(i<nums.length-1){
            if(nums[i]<=nums[i+1]){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }

}
