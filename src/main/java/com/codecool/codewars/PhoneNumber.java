package com.codecool.codewars;

public class PhoneNumber {
    public static void main(String[] args) {
         int[] number={1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    }
    public static String createPhoneNumber(int[] numbers) {
    String phoneNumber="";
    phoneNumber="(";

    for(int i=0; i<3; i++){
        phoneNumber+=numbers[i];
    }

    phoneNumber+=" ";

        for(int i=3; i<6; i++){
            phoneNumber+=numbers[i];
        }
        phoneNumber+="-";

        for(int i=6; i< numbers.length; i++){
            phoneNumber+=numbers[i];
        }
    return phoneNumber;
    }
    public static String createPhoneNumber2(int[] numbers) {
        String phoneNumber = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                phoneNumber += "(";
            } else if (i == 3) {
                phoneNumber += ") ";
            } else if (i == 6) {
                phoneNumber += " ";
            }
            phoneNumber += numbers[i];
        }
        return phoneNumber;
    }
        public static String createPhoneNumber3 (int[] numbers) {
            StringBuilder sb = new StringBuilder();
            sb.append("(").append(numbers[0]).append(numbers[1]).append(numbers[2]).
                    append(") ").append(numbers[3]).append(numbers[4]).append(numbers[5]).
                    append(" ").append(numbers[6]).append(numbers[7]).append(numbers[8]).
                    append(numbers[9]);
            return sb.toString();
        }

   // "(123) 456-7890"
}
