package zestaw4;

import java.util.ArrayList;

public class KoszykZakupowy {
    private ArrayList<Produkt> koszyk = new ArrayList<>();

    public void dodajProdukt(Produkt produkt, int ilosc){
        if(produkt.usunZMagazynu(ilosc)){
            koszyk.add(new Produkt(produkt.getNazwa(), produkt.getCena(), ilosc));
            System.out.println("Dodano do koszyka: " + produkt.getNazwa() + "ilość: " + ilosc);
        }
        else{
            System.out.println("Brak na magazynie: " + produkt.getNazwa());
        }
    }

    public void wyswietlZawartoscKoszyka(){
        System.out.println("\nKoszyk:");
        for(Produkt p : koszyk){
            System.out.println(p.getNazwa() + " x " + p.getIloscNaMagazynie());
        }
    }

    public double obliczCalkowitaWartosc(){
        double suma = 0;
        for(Produkt p : koszyk){
            suma += p.getCena() * p.getIloscNaMagazynie();
        }
        return suma;
    }
}
