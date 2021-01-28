package com.codecool.codewars;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.isDigit;

public class HighAndLow {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5")); // return "5 1"
        highAndLow("1 2 -3 4 5"); // return "5 -3"
        highAndLow("1 9 3 4 -5"); // return "9 -5"
    }
    public static String highAndLow(String numbers) {
        String maxMin="";

        ArrayList<String> selectedNumbers=new ArrayList<>(Arrays.asList(numbers.split(" ")));

        int min=2147483647;
        int max=-2147483640;

        for(int i=0; i<selectedNumbers.size(); i++){
            if(min>Integer.parseInt(selectedNumbers.get(i))){
                min=Integer.parseInt(selectedNumbers.get(i));
            }if(max<Integer.parseInt(selectedNumbers.get(i))){
                max=Integer.parseInt(selectedNumbers.get(i));
            }

        }
        maxMin+=max+" "+min;
                return maxMin;
    }
    public static String highAndLow2(String numbers) {
        String[] temp = numbers.split(" ");
        int max =Arrays.stream(temp).mapToInt(Integer::parseInt).max().getAsInt();
        int min =Arrays.stream(temp).mapToInt(Integer::parseInt).min().getAsInt();
        return min+" "+max;
    }

}
