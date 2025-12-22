package Kolokwium_1_C.Podciag;

public class Podciag {
    public static void main(String[] args) {
        int[] tab = new int[] {1,2,3,4,5,3,2,1,1};
        System.out.println(dlugoscRosnacego(tab));
    }

    public static int dlugoscRosnacego(int[] tab){
        if(tab == null || tab.length == 0){
            return 0;
        }

        int currentLength = 1;
        int maxLength = 1;

        for(int i = 1; i < tab.length; i++){
            if(tab[i-1] < tab[i]){
                currentLength++;
            }
            else{
                currentLength = 1;
            }
            if(currentLength > maxLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
