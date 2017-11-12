package pl.sda;

import java.util.Scanner;

public class instrukcjiwarunkowe2 {
    public static  void  main(String[] agrs) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        porownianieliczb(a, b);
    }

    public static void porownianieliczb(int a, int b){
        if(a>b){
            System.out.println(a + ">" +b);
        }
        else if(a<b) System.out.println(a + "<" + b);
        else if (a==b) System.out.println(a+"="+b);

    }
}
