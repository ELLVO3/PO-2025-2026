package zad3;

public class Ciag {

    public static void main(String[] args) {
        int[] tab = new int[] {1,2,33,2,1,2,3,4,5,6};

        System.out.println(najdluzszyRosnacy(tab));
    }

    public static int najdluzszyRosnacy(int[] tab){
        if(tab == null || tab.length == 0){
            return 0;
        }

        int current = 1;
        int max = 1;

        for(int i = 1; i < tab.length; i++){
            if(tab[i] > tab[i-1]){
                current++;
            }
            else{
                current = 1;
            }
        }
        if(current > max){
            max = current;
        }
        return max;
    }
}
