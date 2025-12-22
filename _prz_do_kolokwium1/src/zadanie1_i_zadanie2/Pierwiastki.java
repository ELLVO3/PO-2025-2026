package zadanie1_i_zadanie2;

public class Pierwiastki {

    static void main(String[] args) {
        System.out.println(pierwiastek(7.23, 2, 2));
    }

    public static int najblizszySasiad(double S, int n){
        double result = pierwiastek(S, n, 10);
        return (int) Math.round(result);
    }

    public static double pierwiastek(double S, int n, int k){
        double x = S / 2.0;
        double epsilon = Math.pow(10, -k);

        while(true){
            double licznik = (n - 1) * x + (S / Math.pow(x, n-1));
            double nextX = licznik / n;

            if(Math.abs(nextX - x) <= epsilon){
                return nextX;
            }
            x = nextX;
        }
    }

}
