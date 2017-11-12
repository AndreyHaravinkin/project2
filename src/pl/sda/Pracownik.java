package pl.sda;

public class Pracownik {
    String imie;
    String nazwisko;
    double wyplata;

    public Pracownik(String imie, String nazwisko, double wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }
    public String toString() {
        return this.imie + " " + this.nazwisko+ " " + this.wyplata;
    }
}

