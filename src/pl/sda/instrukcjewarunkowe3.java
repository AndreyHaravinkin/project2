package pl.sda;

import java.util.Scanner;
public class instrukcjewarunkowe3 {
    public static void main(String[] args){
     Scanner s = new Scanner(System.in) ;
     int liczba = s.nextInt();

     switch (liczba){
         case -5:
         case -4:
         case -3:
         case -2:
         case -1:
             System.out.println("od -5 do -1");
          break;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
             System.out.println("od 1 do 5");
             break;
          default:
              System.out.println("poza zakresem");
     }
    }

}
