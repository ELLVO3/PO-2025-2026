package zestaw4;

public class zestaw4 {

    public static void main(String[] args){
        Produkt woda = new Produkt("Woda", 2.99, 5);
        Produkt wino = new Produkt("Wino", 35.99, 3);

        KoszykZakupowy koszyk = new KoszykZakupowy();


        koszyk.dodajProdukt(woda, 3);
        koszyk.dodajProdukt(wino, 2);
        koszyk.dodajProdukt(woda, 3);

        koszyk.wyswietlZawartoscKoszyka();

        System.out.println("\nWartość koszyka: " + koszyk.obliczCalkowitaWartosc() + "zł");

        System.out.println("\nMagazyn po zakupach:");
        woda.wyswietlInformacje();
        wino.wyswietlInformacje();
    }
}
