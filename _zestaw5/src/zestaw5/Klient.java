package zestaw5;

import java.util.ArrayList;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;
    private ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        setImie(imie);
        setNazwisko(nazwisko);
        setAdres(adres);
        setListaZamowien(new ArrayList<Zamowienie>());
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        getListaZamowien().add(zamowienie);
    }

    public void wyswietlHistorieZamowien(){
        for(int i = 0; i < getListaZamowien().size(); i++){
            System.out.printf("\nZamowienie nr. %d", i+1);
            System.out.println(getListaZamowien().get(i));
        }
    }

    public float obliczLacznyKosztZamowien(){
        float lacznyKosztZamowien = 0.0f;
        for(Zamowienie zam : getListaZamowien()){
            lacznyKosztZamowien += zam.getKoszyk().obliczCalkowitaWartosc();
        }
        return lacznyKosztZamowien;
    }

    @Override
    public String toString(){
        String klientInfo = "\nKlient: " + getImie() + " " + getNazwisko();
        String adresInfo = getAdres().toString();

        return klientInfo + "\n" + adresInfo + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Klient klient)) return false;
        return Objects.equals(imie, klient.imie) && Objects.equals(nazwisko, klient.nazwisko) && Objects.equals(adres, klient.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isBlank()){
            throw new IllegalArgumentException("Imie nie może być nullem bądź być puste.");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko == null || nazwisko.isBlank()){
            throw new IllegalArgumentException("Nazwisko nie może być nullem bądź być puste.");
        }
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if(adres == null){
            throw new IllegalArgumentException("Adres nie może być pusty");
        }
        this.adres = adres;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        if(listaZamowien == null){
            throw new IllegalArgumentException("listaZamowien nie może być nullem.");
        }
        this.listaZamowien = listaZamowien;
    }
}
