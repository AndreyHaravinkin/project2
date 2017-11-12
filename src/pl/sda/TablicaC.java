package pl.sda;

import java.util.Scanner;

public class TablicaC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int iloscCyfr = s.nextInt();

        long suma =0;

        while (iloscCyfr>0){
            long liczba = s.nextLong();
            if (Math.abs(liczba)<100000000000l) {
                System.out.println("za mala liczba");
                break;
            }
             suma = suma + liczba;
             iloscCyfr--;



        }
        System.out.println("suma wynosi" + suma);




    }

}
