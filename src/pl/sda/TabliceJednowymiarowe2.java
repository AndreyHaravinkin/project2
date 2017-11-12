package pl.sda;

import java.util.Scanner;

public class TabliceJednowymiarowe2 {
    public static void main(String[] args) {
        int[][] liczby = new int[5][5];
        for(int i=0; i<liczby.length; i++){
            for(int j=0; j<liczby[i].length; j++) {
                if (i == j) {
                    liczby[i][j] = i;
                }
                System.out.print(liczby[i][j] + "\t");


            }
            System.out.println();
        }
    }
}
