package _zad4_i_zad5;

public class CiagAlikwotowy {

    public static void main(String[] args) {
        ciagAlikwotowy(7, 12);
        analizaAkwiliowa(7, 12);

        ciagAlikwotowy(5, 6);
        analizaAkwiliowa(5, 6);
    }

    public static void ciagAlikwotowy(int k, int start){

        int current = start;

        for(int i = 0; i < k; i++){
            System.out.println(current + " ");

            int sum = 0;

            for(int j = 1 ; j <= current / 2; j++){
                if(current % j == 0){
                    sum += j;
                }
            }
            current = sum;
        }
        System.out.println("------------");
    }

    public static void analizaAkwiliowa(int k , int start){
        int current = start;

        int min = start;
        int max = start;

        for(int i = 0; i < k; i++){
            if(current < min){
                min = current;
            }
            if(current > max){
                max = current;
            }

            int sum = 0;

            for(int j = 1 ; j <= current / 2; j++){
                if(current % j == 0){
                    sum += j;
                }
            }
            current = sum;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("------------");
    }

}
