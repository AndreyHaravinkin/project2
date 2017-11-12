package pl.sda;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class CwiczenieString2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a= s.nextLine();
        int b = s.nextInt();
        int c = s.nextInt();

        if(b>a.length()|(c>a.length())){
            System.out.println("za krotki String");
            return;
        }
        if((b<0)|(c<0)){
            System.out.println("nie mozna");
        }
        System.out.println();
        System.out.println(a.substring(b,c));





    }
}
