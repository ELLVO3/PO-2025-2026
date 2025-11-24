package zestaw6;

public interface OperacjeSklepu {
    void dodajDoSklepu(Produkt produkt, int newIlosc);

    Produkt wyszukajProdukt(String nazwa);

    void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszykZakupowy);
}
