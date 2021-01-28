package com.codecool.codewars;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
    }
    public static int[][] matrixAddition(int[][] a, int[][] b) {


        int[][] result= new int[a.length][a.length];
        for (int i=0; i<a.length; i++ ){
            for(int j=0; j<a[i].length;j ++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }
}
