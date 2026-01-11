package swap;

public class Swapper {
    public static <T> void swapElements(T[] tab, int e1, int e2){
        for(int i = 0; i < tab.length; i++){
            if(tab == null || e1 < 0 || e1 >= tab.length || e2 < 0 || e2 >= tab.length){
                return;
            }

            T temp = tab[e1];
            tab[e1] = tab[e2];
            tab[e2] = temp;
        }
    }
}
