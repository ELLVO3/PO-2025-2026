package zestaw4;

public class Zamowienie {

    public KoszykZakupowy koszyk;
    String statusZamowienia;

    public Platnosc platnosc;

    public Zamowienie() {
        this.koszyk = new KoszykZakupowy();
        this.statusZamowienia = "Nowe";
        this.platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
    }

    public void ustawStatusZamowienia(String statusZamowienia){
        this.statusZamowienia = statusZamowienia;
    }

    public void wyswietlZamowienie(){
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Status: " + statusZamowienia);
    }

    public void finalizujZamowienie(){
        if(platnosc.statusPlatnosci.equals("Opłacone")){
            ustawStatusZamowienia("Gotowe do wysyłki");
        }
    }

    public void zwrocProdukt(Produkt produkt, int ilosc){
        while(koszyk.produkty.contains(produkt) && ilosc > 0){
            koszyk.produkty.remove(produkt);
            ilosc--;
            produkt.dodajDoMagazynu();
        }
        platnosc = new Platnosc(this.koszyk.obliczCalkowitaWartosc());
    }
}
