package pl.sda;

import java.util.Scanner;
public class instrukcjewarunkowe4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int liczba = s.nextInt();
        int reszta=liczba%2;

        switch (reszta){
            case 0:
                System.out.println("liczba parzysta");
                break;
                default:
                    System.out.println("liczba nie parzysta");
        }




    }
    }