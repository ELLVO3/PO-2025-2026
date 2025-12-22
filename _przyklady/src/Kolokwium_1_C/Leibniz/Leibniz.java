package Kolokwium_1_C.Leibniz;

public class Leibniz {
    static void main(String[] args) {
        System.out.println(najblizszaWielokrotnosc(11, 5));
        System.out.println(obliczPi(4));
    }

    public static int najblizszaWielokrotnosc(int S, int n){
        if(n == 0){
            return 0;
        }
        int smaller = (S/n) * n;

        int bigger;

        if(S >= 0){
            bigger = smaller + n;
        }
        else{
            bigger = smaller - n;
        }

        int distToSmaller = Math.abs(S - smaller);
        int distToBigger = Math.abs(S - bigger);

        if(distToSmaller <= distToBigger){
            return smaller;
        }
        else{
            return bigger;
        }
    }

    public static double obliczPi(int k){
        double dokladnosc = Math.pow(10, -k);

        double sum = 0.0;
        double mianownik = 1.0;
        int znak = 1;

        double wyraz = 1.0/mianownik;

        while(wyraz > dokladnosc){
            sum = sum + (znak * wyraz);

            znak = -znak;
            mianownik += 2;

            wyraz = 1.0/mianownik;
        }
        return sum * 4;
    }
}
