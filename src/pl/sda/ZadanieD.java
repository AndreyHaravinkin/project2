package pl.sda;

import java.util.Scanner;

public class ZadanieD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int iloszCyfr = s.nextInt();
        int liczbaCyfr = iloszCyfr;

        double iloszlicbDodatnych = 0;
        double iloszlicbUjemnych = 0;
        double iloszlicbZero = 0;

        while (iloszCyfr>0){
            int wczytana = s.nextInt();
            if (wczytana>0) {
                iloszlicbDodatnych++;
            }
            if (wczytana<0){
                iloszlicbUjemnych ++;
            }
            if (wczytana==0){
                iloszlicbZero++;
            }
            iloszCyfr--;
        }

        System.out.println("Wynik" + iloszlicbDodatnych/liczbaCyfr +"," + iloszlicbUjemnych/liczbaCyfr + "," + iloszlicbZero/liczbaCyfr);

    }
}
