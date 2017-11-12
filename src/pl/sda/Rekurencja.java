package pl.sda;

public class Rekurencja {
    public static void main(String[] args) {
     int wynik = fib(1);
        System.out.println(wynik);
    }
    static int fib (int n){
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

}
