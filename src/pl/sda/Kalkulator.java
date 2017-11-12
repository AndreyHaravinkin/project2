package pl.sda;

import java.util.Scanner;

public class Kalkulator {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        double liczbaa = s.nextDouble();
        double liczbab = s.nextDouble();
        double liczbac = s.nextDouble();
        double liczbad = s.nextDouble();
        double liczbae = liczbaa + liczbab * liczbac - liczbad / 2;
        System.out.println(liczbaa);
        System.out.println(liczbab);
        System.out.println(liczbac);
        System.out.println(liczbad);

        System.out.println("wynik to" + liczbae);



    }
}
