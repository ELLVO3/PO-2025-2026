package zestaw4;

import java.util.ArrayList;

public class Klient {
    public String imie;
    public String nazwisko;
    public ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<Zamowienie>();
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien(){
        for(int i = 0; i < listaZamowien.size(); i++){
            System.out.printf("\nZamowienie nr. %d", i+1);
            listaZamowien.get(i).wyswietlZamowienie();
        }
    }

    public float obliczLacznyKosztZamowien(){
        float suma = 0.0f;
        for(Zamowienie zam : listaZamowien){
            suma += zam.koszyk.obliczCalkowitaWartosc();
        }
        return suma;
    }
}
