package pl.sda;

import java.util.Scanner;

public class PetlaFor {
    public static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        int liczba1=1;
        for(int liczba = 0; liczba<4; liczba++){
            System.out.println(liczba);
        }
        for (int liczba2=0; liczba2<=10; liczba2++){
            if(liczba1==5)break;
            System.out.println((liczba1 +"*" + liczba2) + "=" +liczba1*liczba2);
        }

    }
}
