package pl.sda;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Kalkulator2 {
    public static void  main(String[] agrs){
        Scanner s = new Scanner(System.in);
        int liczba = 3;
        int liczba2 = 5;
        int wynik = potega(liczba);
        int wynik2 = potega(liczba2);
        int wynik3 = suma(liczba,liczba2);
        int wynik4 = suma(wynik, wynik2);
        System.out.println(wynik*wynik2);



    }

    public static  int potega(int podstawa){
        return  podstawa * podstawa;

    }

    public  static  int suma(int a, int b){

        return a+b;

    }


}
