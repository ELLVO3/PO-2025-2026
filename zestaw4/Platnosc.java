package zestaw4;

public class Platnosc {

    public float kwota;
    public String statusPlatnosci;

    public Platnosc(float kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nie opłacone";
    }

    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.kwota = 0.0f;
    }
}
