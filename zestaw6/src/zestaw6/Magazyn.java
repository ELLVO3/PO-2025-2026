package zestaw6;

import java.util.HashMap;
import java.util.Map;

public class Magazyn {

    private Map<Produkt, Integer> stanyMagazynowe;

    public Magazyn() {
        setStanyMagazynowe(new HashMap<>());
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Zawartość magazynu:\n");

        for(Map.Entry<Produkt, Integer> wpis : getStanyMagazynowe().entrySet()){
            Produkt produkt = wpis.getKey();
            Integer ilosc = wpis.getValue();

            builder.append("Nazwa: ").append(produkt.getNazwa());
            builder.append("\nIlość: ").append(ilosc).append("\n");
        }
        return builder.toString();
    }

    public void dodajNaStan(Produkt produkt, int ilosc){
        if(getStanyMagazynowe().containsKey(produkt)){
            int currentIlosc = getStanyMagazynowe().get(produkt);

            int newIlosc = currentIlosc + ilosc;

            getStanyMagazynowe().put(produkt, newIlosc);
        }
        else{
            getStanyMagazynowe().put(produkt, ilosc);
        }
    }

    public boolean usunZeStanu(Produkt produkt, int ilosc) {
        if (ilosc <= 0) {
            return false;
        }

        if (getStanyMagazynowe().containsKey(produkt) && getStanyMagazynowe().get(produkt) >= ilosc) {

            int currentIlosc = getStanyMagazynowe().get(produkt);

            int newIlosc = currentIlosc - ilosc;

            getStanyMagazynowe().put(produkt, newIlosc);

            return true;
        }
        else {
            return false;
        }
    }

    public Map<Produkt, Integer> getStanyMagazynowe() {
        return stanyMagazynowe;
    }

    public void setStanyMagazynowe(Map<Produkt, Integer> stanyMagazynowe) {
        if(stanyMagazynowe == null){
            throw new IllegalArgumentException("Stany magazynowe nie mogą być puste.");
        }
        this.stanyMagazynowe = stanyMagazynowe;
    }
}
