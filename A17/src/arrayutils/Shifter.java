package arrayutils;

public class Shifter {
    public static <T> void shiftElementsRight(T[] tab){

        if(tab == null || tab.length == 0){
            return;
        }

        T last = tab[tab.length - 1];

        for(int i = tab.length - 1; i > 0; i--){
            tab[i] = tab[i - 1];
        }
        tab[0] = last;
    }
}
