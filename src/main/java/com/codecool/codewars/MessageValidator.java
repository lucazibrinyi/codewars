package com.codecool.codewars;



public class MessageValidator {
    public static void main(String[] args) {
        System.out.println(isAValidMessage2("2hic5hell"));
    }
    public static boolean isAValidMessage(String message) {

        char[] m = message.toCharArray();
        int i=0;
        while(i<m.length){

            if (isDigit(m[i]) == true) {
                int j=i+1;
                while(j<=i+m[i]){
                    if(!isDigit(m[j])){
                        continue;
                    }else {
                        return false;
                    }
                }

            }else{
                return false;
            } if(i+m[i]< m.length)
                i+=m[i];
        }
        return true;
    }
    public static boolean isDigit(char ch){
        char[] digit={'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0; i< digit.length;i++){
            if(ch==digit[i]){
                return true;
            }
        }
        return false;
    }
    public static boolean isAValidMessage2(String message) {
        int messageLength = message.length();
        int isNumber = message.charAt(0);

        if (isNumber == Character.getNumericValue(isNumber)) {
            return false;
        }

        String words = message.replaceAll("[0-9]", "");
        int wordsLength = words.length();
        String numbers = message.replaceAll("[^0-9]", ",");
        int[] arrayForNumbers = new int[message.length()-(wordsLength)];
        int howManyNumsIndex = 0;
        boolean skipNextNumber = false;
        for (int i = 0; i < numbers.length(); i++) {
            String ch = "";
            String ch2 = "";
            String doubleDigits = "";
            if (i+1 < numbers.length()) {
                ch2 = ch2 + numbers.charAt(i+1);
            }
            ch = ch + numbers.charAt(i);
            if (!(ch.equals(",")) && !(ch2.equals(",")) ){//ki írja arrayForNumbers string array-be a számoakt 33
                doubleDigits = doubleDigits + ch;
                doubleDigits = doubleDigits + ch2;
                arrayForNumbers[howManyNumsIndex] = Integer.parseInt(doubleDigits);
                howManyNumsIndex++;
                skipNextNumber = true;
                continue;
            } else if (!(ch.equals(",")) && arrayForNumbers[howManyNumsIndex] == 0) {// 3
                if (skipNextNumber == true) {
                    skipNextNumber = false;
                    continue;
                }
                arrayForNumbers[howManyNumsIndex] = Character.getNumericValue(numbers.charAt(i));
                howManyNumsIndex++;
                continue;
            }
        }
        int howManyNums = 0;
        for (int i = 0; i < arrayForNumbers.length; i++) {
            if (arrayForNumbers[i] > 0) {
                howManyNums += arrayForNumbers[i];
            }
        }
        return howManyNums == words.length();
    }
}
