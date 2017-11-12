package pl.sda;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        int wynik = silnia(5);
        System.out.println(wynik);

    }
    static int silnia(int i){
        if (i==1){
            return 1;
        }else {
            return i*silnia(i-1);
        }
    }
}
