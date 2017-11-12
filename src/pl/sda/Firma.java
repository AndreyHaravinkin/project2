package pl.sda;

public class Firma {
    private int limit;
    private int index = 0;
    private Pracownik[] pracownicy;

    public Firma(int limit) {
        this.limit = limit;
        pracownicy = new Pracownik[limit];
    }

    public void dodajPracownika(Pracownik pracownik) {
        if (index > limit - 1) {
            System.out.println("Nie można więcej zatrudniać");
        } else {
            pracownicy[index] = pracownik;
            index++;
        }
    }

    public void wyswietlPracownikow() {
        for (Pracownik pracownik : pracownicy) {
            if (pracownik == null || pracownik.imie == null || pracownik.nazwisko == null) {
                continue;
            }
            System.out.println(pracownik);
        }
    }

    public void sumaPensji() {
        double suma = 0;
        for (Pracownik pracownik : pracownicy) {
            if (pracownik == null) {
                continue;
            }
            suma = suma + pracownik.wyplata;
        }
        System.out.println("zatrudniam " + pracownicy.length + " pracowników i płace im " + suma);
    }
    public void dodajPodwyzke(double procent){
        if (procent<0)
            return;

        for ( Pracownik pracownik :pracownicy){
            if (pracownik == null){
                continue;
            }
            pracownik.wyplata+=pracownik.wyplata*procent/100;
            //to samo co pracownik.wyplata = pracownik.wyplata + pracownik.wyplata*procent/100;
        }
    }

    public void pracuje(String imie)
    {
        boolean znaleziony=false;

        for (Pracownik pracownik : pracownicy) {
            if (pracownik!=null && imie.equals(pracownik.imie)) {
                System.out.println(pracownik.imie + " " + pracownik.nazwisko);
                znaleziony = true;
            }
        }
        if (!znaleziony)
            System.out.println("Nie znaleziono");
    }



}