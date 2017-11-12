package pl.sda;

public class Stringi {
    public static void main(String[] args){
        String pierwszyString = "tekst";
        String kolejnyString = new String("inny tekst");
        System.out.println(pierwszyString +", " + kolejnyString );

        pierwszyString.toUpperCase();
        System.out.println(pierwszyString +", " + kolejnyString);

        pierwszyString = "zmieniony tekst";
        System.out.println(pierwszyString +", " + kolejnyString);

        pierwszyString = pierwszyString.toUpperCase();
         System.out.println(pierwszyString);

    }
}
