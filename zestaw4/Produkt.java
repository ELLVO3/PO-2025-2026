package zestaw4;

public class Produkt {
        String nazwa;
        double cena;
        int iloscNaMagazynie;

        public Produkt(String nazwa, double cena, int iloscNaMagazynie){
            this.nazwa = nazwa;
            this.cena = cena;
            this.iloscNaMagazynie = iloscNaMagazynie;
        }


    public String getNazwa(){
            return nazwa;
        }

        public double getCena(){
            return cena;
        }

        public int getIloscNaMagazynie(){
            return iloscNaMagazynie;
        }

        public void wyswietlInformacje() {
            System.out.println("Nazwa: " + nazwa + "\n" + "Cena: " + cena + "\n" + "Ilość na magazynie: " + iloscNaMagazynie + "\n");
        }

        public void dodajDoMagazynu(int ilosc){
            iloscNaMagazynie += ilosc;
        }

        public boolean usunZMagazynu(int ilosc){
            if(iloscNaMagazynie >= ilosc){
                iloscNaMagazynie -= ilosc;
                return true;
            }
            else{
                return false;
            }
        }
}
