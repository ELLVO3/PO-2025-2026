package zestaw6;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class KoszykZakupowy {

    private Map<Produkt, Integer> produkty;

    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt){
        if(produkty.containsKey(produkt)){
            int currentIlosc = produkty.get(produkt);
            produkty.put(produkt, currentIlosc + 1);
        }
        else{
            produkty.put(produkt, 1);
        }
    }

    @Override
    public String toString(){
        String fLine = "";
        fLine += "Zawartość koszyka:\n";

        for(Map.Entry<Produkt, Integer> wpis: produkty.entrySet()){
            Produkt produkt = wpis.getKey();
            Integer ilosc = wpis.getValue();

            fLine += "Nazwa produktu: " + produkt.getNazwa() + "\nIlość: " + ilosc + "\nCena: " + produkt.getCena() + "\n";
        }
        return fLine;
    }

    public float obliczCalkowitaWartosc(){
        float calkCena = 0.0f;
        for(Map.Entry<Produkt, Integer> wpis : produkty.entrySet()){
            float cenaProduktu = wpis.getKey().getCena();
            int ilosc = wpis.getValue();

            calkCena += cenaProduktu * ilosc;
        }
        return calkCena;
    }

    public boolean usunJedenProdukt(Produkt produkt){
        if(!produkty.containsKey(produkt)){
            return false;
        }

        int currentIlosc = produkty.get(produkt);

        if(currentIlosc > 1){
            produkty.put(produkt, currentIlosc - 1);
        }
        else {
            produkty.remove(produkt);
        }
        return true;
    }

    public Map<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(Map<Produkt, Integer> produkty) {
        if(produkty == null){
            throw new IllegalArgumentException("Mapa nie może być nullem.");
        }

        this.produkty = produkty;
    }
}