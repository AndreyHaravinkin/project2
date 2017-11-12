package pl.sda;

import java.util.Scanner;

public class TabliceA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B= new StringBuilder(A).reverse().toString();
        if (A.equals(B)){
            System.out.println("Tak");
        }else {
            System.out.println("Nie");
        }
    }
}
/** palindromem*/