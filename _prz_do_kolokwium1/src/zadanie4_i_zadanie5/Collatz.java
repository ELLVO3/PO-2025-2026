package zadanie4_i_zadanie5;

public class Collatz {

    static void main(String[] args) {
        sekwencjaCollatza(13, 11);

        minMaxSekwencjaCollatza(13, 11);
    }

    private static int nastepnyCollatz(int c){
        if( c % 2 == 0){
            return c / 2;
        }
        else{
            return c * 3 + 1;
        }
    }

    private static void sekwencjaCollatza(int n, int c){
        int current = c;
        for(int i = 0; i < n; i++){
            System.out.println(current + " ");
            current = nastepnyCollatz(current);
        }
    }

    private static void minMaxSekwencjaCollatza(int n, int c){
        int current = c;
        int min = c;
        int max = c;

        for(int i = 0; i < n; i++){
            if(current < min){
                min = current;
            }
            if(current > max){
                max = current;
            }

            current = nastepnyCollatz(current);
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}
