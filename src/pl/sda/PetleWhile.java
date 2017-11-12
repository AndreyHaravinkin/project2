package pl.sda;

import java.util.Scanner;

public class PetleWhile {
    public static void main(String[] agrs ){
        Scanner s = new Scanner(System.in);
        int liczba = s.nextInt();
        int parametr = 1;
        do{
            System.out.println((liczba * parametr ));
            parametr++;
        } while (parametr<=10);

    }
}
