package arrayutils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverser {
    public static <T> void reverseArray(T[] tab){
        for(int i = 0; i < tab.length / 2; i++){
            T temp = tab[i];
            tab[i] = tab[tab.length - i - 1];
            tab[tab.length - i - 1] = temp;
        }
    }
}
