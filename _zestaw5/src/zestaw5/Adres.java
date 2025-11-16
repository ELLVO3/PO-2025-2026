package zestaw5;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, String kodPocztowy) {
        setUlica(ulica);
        setNumerDomu(numerDomu);
        setNumerMieszkania(numerMieszkania);
        setMiasto(miasto);
        setKodPocztowy(kodPocztowy);
    }

    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy) {
        this(ulica, numerDomu, null, miasto, kodPocztowy);
    }

    @Override
    public String toString() {

        String line1 = "Informacje o adresie zamieszkania:\n" + getKodPocztowy() + " " + getMiasto();
        String line2;

        if(getNumerMieszkania() != null){
            line2 = "Ulica: " + getUlica() + ", nr. domu: " + getNumerDomu() + ", nr. mieszkania: " + getNumerMieszkania();
        }
        else{
            line2 = "Ulica: " + getUlica() + ", nr. domu: " + getNumerDomu();
        }
        return line1 + "\n" + line2;
    }

    public boolean przed(Adres inny){
        return getKodPocztowy().compareTo(inny.getKodPocztowy()) < 0;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if(ulica == null || ulica.isBlank()){
            throw new IllegalArgumentException("Ulica nie może być nullem lub być pusta.");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if(numerDomu == null || numerDomu.isBlank()){
            throw new IllegalArgumentException("Numer domu nie może być nullem bądź być pusty.");
        }
        this.numerDomu = numerDomu;
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if(miasto == null || miasto.isBlank()){
            throw new IllegalArgumentException("Miasto nie może być nullem bądź by puste.");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy == null || kodPocztowy.isBlank()){
            throw new IllegalArgumentException("Kod pocztowy nie może być nullem bądź być pusty.");
        }
        this.kodPocztowy = kodPocztowy;
    }
}
