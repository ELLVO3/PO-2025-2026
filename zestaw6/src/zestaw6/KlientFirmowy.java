package zestaw6;

public class KlientFirmowy extends Klient{
    private static int NIP;
    private static int REGON;

    public KlientFirmowy(String imie, String nazwisko, Adres adres) {
        super(imie, nazwisko, adres);
    }
}
