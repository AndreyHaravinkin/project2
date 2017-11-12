package pl.sda;

public class Uruchamiam {
    public static void main(String[] args) {

        Firma firma = new Firma(5);
        Pracownik pracownik1 = new Pracownik("Darek", "C", 1000);
        Pracownik pracownik2 = new Pracownik("Paweł", "Z", 2000);
        Pracownik pracownik3 = new Pracownik("Rafal", "W", 1500);
        Pracownik pracownik4 = new Pracownik("Monika", "X", 2000);
        Pracownik pracownik5 = new Pracownik("Piotr", "A", 1000);

        firma.dodajPracownika(pracownik1);
        firma.dodajPracownika(pracownik5);
        firma.dodajPracownika(pracownik3);
        firma.dodajPracownika(pracownik4);
        //	firma.dodajPracownika(pracownik5);
        //		firma.dodajPracownika(pracownik1);

        firma.wyswietlPracownikow();
        firma.sumaPensji();
        firma.dodajPodwyzke(10);
        firma.sumaPensji();
        firma.dodajPodwyzke(-10);
        firma.sumaPensji();

        firma.pracuje("Piotr");
    }






}
