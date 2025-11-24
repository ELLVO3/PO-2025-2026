package zestaw6;

import java.util.Objects;

public class Platnosc {

    private float kwota;
    private String statusPlatnosci;

    public Platnosc(float kwota) {
        setKwota(kwota);
        setStatusPlatnosci("Nie opłacone");
    }

    public void zaplac(){
        setStatusPlatnosci("Opłacone");
        setKwota(0.0f);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Platnosc platnosc)) return false;
        return Float.compare(kwota, platnosc.kwota) == 0 && Objects.equals(statusPlatnosci, platnosc.statusPlatnosci);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, statusPlatnosci);
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        if(kwota < 0.0f){
            throw new IllegalArgumentException("Kwota nie może być ujemna.");
        }
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if(statusPlatnosci == null || statusPlatnosci.isBlank()){
            throw new IllegalArgumentException("Status płatności nie może być nullem bądź być pusty.");
        }
        this.statusPlatnosci = statusPlatnosci;
    }
}