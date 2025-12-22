package _zad1_i_zad2;

public class Bijekcja {

    public static void main(String[] args) {
        System.out.println("S = 20 -> " + najblizszyPierwiastek(20));

        double S = 20;
        int k = 4;

        double result = pierwiastekBijekcja(S, k);
        System.out.println(result);

    }

    public static int najblizszyPierwiastek(int S){
        if(S <= 0){
            return 0;
        }

        int i = 1;

        while(i * i <= S){
            if(i * i == S){
                return S;
            }
            i++;
        }

        int largerCandidate = i;
        int smallerCandidate = i - 1;

        int smallerDifference = S - (smallerCandidate * smallerCandidate);
        int largerDifference = (largerCandidate * largerCandidate) - S;

        if(smallerDifference < largerDifference){
            return smallerCandidate;
        }
        else{
            return largerCandidate;
        }
    }

    public static double pierwiastekBijekcja(double S, int k){
        double epsilon = Math.pow(10, -k);

        double low = 0;
        double high = S;

        if(S < 1.0){
            high = 1.0;
        }

        double mid = 0;

        while((high - low) > epsilon){
            mid = (high + low) / 2;

            if(mid * mid > S){
                high = mid;
            }
            else {
                low = mid;
            }
        }

        return (low + high) / 2.0;
    }

}
