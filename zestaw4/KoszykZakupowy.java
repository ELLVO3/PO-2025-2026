package zestaw4;

import java.util.ArrayList;

public class KoszykZakupowy {

    public ArrayList<Produkt> produkty;

    public KoszykZakupowy() {
        this.produkty = new ArrayList<Produkt>();
    }

    public void dodajProdukt(Produkt produkt){
        if(produkt.iloscNaMagazynie > 0){
            produkt.usunZMagazynu();
        }
        else{
            System.out.println("\nZa mała ilość produktu na magazynie");
        }
        produkty.add(produkt);
    }

    public void wyswietlZawartoscKoszyka(){

        ArrayList<Produkt> zliczane = new ArrayList<Produkt>(this.produkty);

        System.out.println("\nZawartość koszyka:");
        while(!(zliczane.isEmpty())){
            Produkt zliczany = zliczane.getFirst();
            int counter = 0;
            for(Produkt produkt : zliczane){
                if(produkt == zliczany){
                    counter++;
                }
            }
            System.out.println(zliczany.nazwa + " x " + counter + "\nCena: " + zliczany.cena + " pln\n");
            while(zliczane.contains(zliczany)){
                zliczane.remove(zliczany);
            }
        }
    }

    public float obliczCalkowitaWartosc(){
        float calkCena = 0.0f;
        for(Produkt produkt : this.produkty){
            calkCena += produkt.cena;
        }
        return calkCena;
    }
}
