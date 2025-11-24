package zestaw6;

import java.util.Objects;

public class Produkt {
    private String nazwa;
    private float cena;

    public Produkt(String nazwa, float cena) {
        setNazwa(nazwa);
        setCena(cena);
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwa + "\nCena: " + cena + " pln";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Produkt produkt)) return false;
        return Float.compare(cena, produkt.cena) == 0 && Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null || nazwa.isBlank()){
            throw new IllegalArgumentException("Nazwa nie może być pusta lub być nullem.");
        }

        this.nazwa = nazwa;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        if(cena < 0.0f){
            throw new IllegalArgumentException("Cena nie może być ujemna.");
        }
        this.cena = cena;
    }
}
