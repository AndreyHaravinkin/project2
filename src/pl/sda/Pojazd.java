package pl.sda;

public class Pojazd {
    int liczbaKol;
    int prendkosc;
    String kolor;


    public Pojazd(int liczbaKol, int prendkosc, String kolor){
        this.liczbaKol = liczbaKol;
        this.prendkosc = prendkosc;
        this.kolor = kolor;
    }

    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd(4, 200, "czerwony");
        System.out.println("Pojazd ma " + pojazd.liczbaKol + " kola , jest " + pojazd.kolor + " i moze echac " + pojazd.prendkosc + " km/h");
    }
}
