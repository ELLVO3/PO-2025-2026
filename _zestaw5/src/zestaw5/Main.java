package zestaw5;

import java.time.LocalDate;

public class Main {
    static void main() {

        Produkt p1 = new Produkt("Mleko", 4.19f);
        Produkt p2 = new Produkt("Snickers", 5.99f);

        System.out.println(p1);
        System.out.println(p2);

        KoszykZakupowy koszyk = new KoszykZakupowy();

        koszyk.dodajProdukt(p1);
        koszyk.dodajProdukt(p1);
        koszyk.dodajProdukt(p1);
        koszyk.dodajProdukt(p2);

        System.out.println(koszyk);

        koszyk.obliczCalkowitaWartosc();

        Zamowienie z1 = new Zamowienie();

        System.out.println(z1);

        z1.setStatusZamowienia("Opłacone");

        System.out.println(z1);

        LocalDate data = LocalDate.of(2005, 8, 16);

        Sklep s1 = new Sklep("Stonka", data);

        s1.dodajDoSklepu(p1, 20);
        s1.dodajDoSklepu(p2, 40);

        System.out.println(s1.getMagazynSklepu());

        Zamowienie z2 = new Zamowienie();

        System.out.println(z2);

        z2.setStatusZamowienia("Opłacone");

        System.out.println(z2);

        s1.zakupy(s1.wyszukajProdukt("Snickers"), 2, z2.getKoszyk());
        s1.zakupy(s1.wyszukajProdukt("Mleko"), 5, z1.getKoszyk());

        Adres a1 = new Adres("Słoneczna", "54", "Olsztyn", "10-719");

        Klient k1 = new Klient("Maciej", "Wojciechowski", a1);
        k1.dodajZamowienie(z1);
        k1.dodajZamowienie(z2);
        System.out.printf("\nŁączna kwota zamowien: %.2f\n", k1.obliczLacznyKosztZamowien());

        System.out.println(s1.getMagazynSklepu());

        z1.getPlatnosc().zaplac();

        z1.finalizujZamowienie();

        z2.zwrocProdukt(p2, 1, s1.getMagazynSklepu());
        k1.wyswietlHistorieZamowien();

        System.out.println(a1);

        // Zadanie 5 z zestawu 5 nie jest wykonalne, chyba, że inaczej nazwiemy klasę.
        // Zamiast getClass to np getClassName, wtedy zadanie by poszło.
        // W związku z tym, że zadanie nie jest możliwe do wykonania z taką treścią to jego tutaj nie podajęję.
    }
}
