package zestaw6;

public interface ZarzadzanieKlientem {
    void dodajZamowienie(Zamowienie zamowienie);

    void wyswietlHistorieZamowien();

    float obliczLacznyKosztZamowien();

    @Override
    String toString();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
