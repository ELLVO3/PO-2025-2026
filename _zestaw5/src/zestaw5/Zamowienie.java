package zestaw5;

public class Zamowienie {

    private KoszykZakupowy koszyk;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie() {
        setKoszyk(new KoszykZakupowy());
        setStatusZamowienia("Nowe");
        setPlatnosc(new Platnosc(getKoszyk().obliczCalkowitaWartosc()));
    }

    @Override
    public String toString(){
        String koszykInfo = getKoszyk().toString();
        String status = "Status: " + getStatusZamowienia();

        return koszykInfo + "\n" + status + "\n";
    }

    public void finalizujZamowienie(){
        if(getPlatnosc().getStatusPlatnosci().equals("Opłacone")){
            setStatusZamowienia("Gotowe do wysyłki");
        }
    }

    public void zwrocProdukt(Produkt produkt, int ilosc, Magazyn magazyn){

        int iloscDoZwrotu = 0;

        for(int i = 0; i < ilosc; i++){
            boolean usunieto = getKoszyk().usunJedenProdukt(produkt);

            if(usunieto){
                iloscDoZwrotu++;
            }
            else{
                break;
            }
        }

        if(iloscDoZwrotu > 0){
            magazyn.dodajNaStan(produkt, iloscDoZwrotu);
            System.out.println("\nZwrócono do magazynu: " + produkt.getNazwa() + "\nIlość: " + iloscDoZwrotu);
        }
        setPlatnosc(new Platnosc(getKoszyk().obliczCalkowitaWartosc()));
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(KoszykZakupowy koszyk) {
        if(koszyk == null){
            throw new IllegalArgumentException("Koszyk nie może być nullem.");
        }

        this.koszyk = koszyk;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        if(statusZamowienia == null || statusZamowienia.isBlank()){
            throw new IllegalArgumentException("Status zamówienia nie może być nullem bądź być pusty.");
        }

        this.statusZamowienia = statusZamowienia;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        if(platnosc == null){
            throw new IllegalArgumentException("Płatność nie może być nullem.");
        }

        this.platnosc = platnosc;
    }
}
