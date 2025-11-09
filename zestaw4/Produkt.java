package zestaw4;

public class Produkt {
    public String nazwa;
    public float cena;
    public int iloscNaMagazynie;

    public Produkt(String nazwa, float cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("\nNazwa: " + nazwa + "\nCena: " + cena + " pln\nIlość na magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(){
        iloscNaMagazynie++;
    }

    public void usunZMagazynu(){
        if(iloscNaMagazynie > 0){
            iloscNaMagazynie--;
        }
        else{
            System.out.println("Brak produktów na magazynie");
        }
    }
}

