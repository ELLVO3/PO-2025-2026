package Kolokwium_1_C.SekwencjaDzielnikow;

public class SekwencjaDzielnikow {
    static void main(String[] args) {
        sekwencjaDzielnikow(5, 21);
        System.out.println("Średnia = " + sredniaSekwencji(5, 21));
    }

    public static void sekwencjaDzielnikow(int n, int c){

        for(int i = 0; i < n; i++){

            System.out.print(c + " ");

            if(c % 4 == 0){
                c = c/4;
            }
            else{
                c = (c * 2) + 2;
            }
        }
        System.out.println();
    }

    public static double sredniaSekwencji(int n, int c){

        double sum = 0.0;

        for(int i = 0; i < n; i++){
            sum += c;
            if(c % 4 == 0){
                c = c/4;
            }
            else{
                c = (c * 2) + 2;
            }
        }
        return sum/n;
    }
}
