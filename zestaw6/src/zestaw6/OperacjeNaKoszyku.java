package zestaw6;

public interface OperacjeNaKoszyku {
    void dodajProdukt(Produkt produkt);

    @Override
    String toString();

    float obliczCalkowitaWartosc();

    boolean usunJedenProdukt(Produkt produkt);

}
