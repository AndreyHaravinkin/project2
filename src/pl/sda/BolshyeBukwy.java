package pl.sda;

import java.util.Scanner;

public class BolshyeBukwy {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s = in.next();
        int count = 0;
        String upper = s.toUpperCase();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)==upper.charAt(i)) count++;
        }
        System.out.println(count);
    }
}
