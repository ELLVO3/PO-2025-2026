package ZestawD.zad1_i_zad2;

public class Horner {

    public static void main(String[] args) {
        System.out.println(potega(5, 2));

        double[] wsp2 = {1, -2, 0, 5};
        System.out.println("Wynik dla x=3: " + obliczWielomian(wsp2, 3));
    }

    public static long potega(int x, int n){
        if(n == 0){
            return 1;
        }

        int result = 1;

        for(int i = 0; i < n; i++){
            result = result * x;
        }
        return result;
    }

    public static double obliczWielomian(double[] wspolczynniki, double x){
        if(wspolczynniki == null || wspolczynniki.length == 0){
            return 0;
        }

        double result = wspolczynniki[0];

        for(int i = 1; i < wspolczynniki.length; i++){
            result = result * x + wspolczynniki[i];
        }
        return result;
    }

}
