package pl.sda;

import java.util.Scanner;

public class CwiczenieString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a =s.nextLine ();
        String b= s.nextLine();
        System.out.println( a.length()+ b.length());

        int nazwa = a.compareTo(b);
        if(nazwa<0) System.out.println("tak");
        else System.out.println("nie");


        String ciagZnakowy = a.substring(0,1).toUpperCase();
        String resztaliter = a.substring(1);
        System.out.println(ciagZnakowy + resztaliter);

        String ciagZnakowy2 = b.substring(0,1).toUpperCase();
        String resztaliter2 = b.substring(1);
        System.out.println(ciagZnakowy2 + resztaliter2);


    }
}
