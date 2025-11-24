package zestaw6;

import java.util.ArrayList;
import java.time.LocalDate;

public class Sklep {
    private Magazyn magazynSklepu;
    private ArrayList<Produkt> katalogProduktow;
    private String nazwaSklepu;
    private LocalDate dataPowstania;


    public Sklep(String nazwaSklepu, LocalDate dataPowstania) {
        setMagazynSklepu(new Magazyn());
        setKatalogProduktow(new ArrayList<Produkt>());
        setNazwaSklepu(nazwaSklepu);
        setDataPowstania(dataPowstania);
    }

    public void dodajDoSklepu(Produkt produkt, int newIlosc){
        getMagazynSklepu().dodajNaStan(produkt, newIlosc);

        if(!getKatalogProduktow().contains(produkt)){
            getKatalogProduktow().add(produkt);
        }
    }

    public Produkt wyszukajProdukt(String nazwa){
        for(Produkt prod : getKatalogProduktow()){
            if(prod.getNazwa().equals(nazwa)){
                return prod;
            }
        }
        return null;
    }

    public void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszykKlienta){

        boolean udaneZakupy = getMagazynSklepu().usunZeStanu(produkt, ilosc);

        if(udaneZakupy){
            for(int i = 0; i < ilosc; i++){
                koszykKlienta.dodajProdukt(produkt);
            }
            System.out.println("\nDodano do koszyka: " + produkt.getNazwa() + "\nIlość: " + ilosc);
        }
        else {
            System.out.println("\nBrak wystarczającej ilości na magazynie: " + produkt.getNazwa());
        }
    }

    public Magazyn getMagazynSklepu() {
        return this.magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if(magazynSklepu == null){
            throw new IllegalArgumentException("Magazyn sklepu nie może być nullem");
        }
        this.magazynSklepu = magazynSklepu;
    }

    public ArrayList<Produkt> getKatalogProduktow() {
        return katalogProduktow;
    }

    public void setKatalogProduktow(ArrayList<Produkt> katalogProduktow) {
        if(katalogProduktow == null){
            throw new IllegalArgumentException("Katalog produktów nie może być nullem.");
        }
        this.katalogProduktow = katalogProduktow;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if(nazwaSklepu == null || nazwaSklepu.isBlank()){
            throw new IllegalArgumentException("Nazwa sklepu nie może być nullem bądź być pusta.");
        }
        this.nazwaSklepu = nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        if(dataPowstania == null || dataPowstania.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data powstania nie może być nullem bądź być z przyszłości.");
        }
        this.dataPowstania = dataPowstania;
    }
}
