package zestaw4;

import java.util.ArrayList;

public class Sklep {
    public ArrayList<Produkt> produkty;

    public Sklep() {
        this.produkty = new ArrayList<Produkt>();
    }

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }

    public void wyswietlOferty(){
        System.out.println("\nWszystkie dostępne oferty w skelpie: ");
        for(Produkt prod : produkty){
            prod.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProdukt(String nazwa){
        for(Produkt prod : produkty){
            if(prod.nazwa.equals(nazwa)){
                return prod;
            }
        }
        return null;
    }

    public void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszykKlienta){
        while(ilosc > 0){
            if(produkt.iloscNaMagazynie > 0){
                koszykKlienta.dodajProdukt(produkt);
                ilosc--;
            }
            else{
                break;
            }
        }
    }
}
