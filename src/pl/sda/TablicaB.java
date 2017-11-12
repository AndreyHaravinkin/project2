package pl.sda;

import java.util.Scanner;

public class TablicaB {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
      int a0 = s.nextInt();
      int a1 = s.nextInt();
      int a2 = s.nextInt();
      int b0 = s.nextInt();
      int b1 = s.nextInt();
      int b2 = s.nextInt();

        System.out.println("A = ("+ a0 +"," + a1 +"," + a2 +")");
        System.out.println("B = ("+ b0 +"," + b1 +"," + b2 +")");

        int sumaA = 0;
        int sumaB = 0;


         if(a0>b0){sumaA ++;}
        else if (b0>0){sumaB++;}


        if (b1 > a1){sumaA ++;}
        else if (a1>b1){sumaB ++;}


        if (a2> b2){sumaA++;}
        else if(b2>a2){sumaB ++;}

        System.out.println("Resultat" + sumaA +":" + sumaB);




    }
}
