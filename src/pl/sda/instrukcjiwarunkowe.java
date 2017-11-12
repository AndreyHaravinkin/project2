package pl.sda;

import java.util.Scanner;

public class instrukcjiwarunkowe {
    public static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        int liczba = s.nextInt();
        if (liczba > 10){
            System.out.println("Liczdf wieksza od 10");
        }
        System.out.println("Koniec programu");
    }
}
