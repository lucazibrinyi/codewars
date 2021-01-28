package com.codecool.codewars;

public class EnoughSpace {
    public static void main(String[] args) {

    }
    public static int enough(int cap, int on, int wait){
        if(cap>=on+wait){
            return 0;
        }else {

            return Math.abs(cap - (on+wait));
        }
    }
    static int enough2(final int capacity, final int alreadyOn, final int waiting){
        return Math.max(0, waiting + alreadyOn - capacity);
    }
    public static int enough3(int cap, int on, int wait){
        return Math.max(0, on + wait - cap);
    }
}
