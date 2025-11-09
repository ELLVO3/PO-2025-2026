package zestaw4;

public class Main {
    static void main(String[] args) {

        Produkt p1 = new Produkt("Mleko", 4.19f, 35);
        Produkt p2 = new Produkt("Snickers", 5.99f, 15);

        p1.wyswietlInformacje();
        p2.wyswietlInformacje();

        p1.dodajDoMagazynu();
        p1.dodajDoMagazynu();
        p2.dodajDoMagazynu();
        p2.dodajDoMagazynu();

        p1.wyswietlInformacje();
        p2.wyswietlInformacje();

        p1.usunZMagazynu();
        p2.usunZMagazynu();

        p1.wyswietlInformacje();
        p2.wyswietlInformacje();

        KoszykZakupowy koszyk = new KoszykZakupowy();

        koszyk.dodajProdukt(p1);
        koszyk.dodajProdukt(p1);
        koszyk.dodajProdukt(p1);
        koszyk.dodajProdukt(p2);

        koszyk.wyswietlZawartoscKoszyka();

        koszyk.obliczCalkowitaWartosc();

        Zamowienie z1 = new Zamowienie();

        z1.wyswietlZamowienie();

        z1.ustawStatusZamowienia("Opłacone");

        z1.wyswietlZamowienie();

        Sklep s1 = new Sklep();

        s1.dodajProdukt(p1);
        s1.dodajProdukt(p2);

        s1.wyswietlOferty();

        Zamowienie z2 = new Zamowienie();

        z2.wyswietlZamowienie();

        z2.ustawStatusZamowienia("Opłacone");

        z2.wyswietlZamowienie();

        s1.zakupy(s1.wyszukajProdukt("Snickers"), 2, z2.koszyk);
        s1.zakupy(s1.wyszukajProdukt("Mleko"), 5, z1.koszyk);

        Klient k1 = new Klient("Maciej", "Wojciechowski");
        k1.dodajZamowienie(z1);
        k1.dodajZamowienie(z2);
        System.out.printf("\nŁączna kwota zamowien: %.2f\n", k1.obliczLacznyKosztZamowien());

        s1.wyswietlOferty();

        z1.platnosc.zaplac();

        z1.finalizujZamowienie();

        z2.zwrocProdukt(p2, 1);
        k1.wyswietlHistorieZamowien();

    }
}
