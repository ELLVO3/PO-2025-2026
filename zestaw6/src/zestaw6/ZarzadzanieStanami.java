package zestaw6;

public interface ZarzadzanieStanami {

    void dodajNaStan(Produkt produkt, int ilosc);

    boolean usunZeStanu(Produkt produkt, int ilosc);

    @Override
    String toString();
}
