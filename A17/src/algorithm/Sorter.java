package algorithm;

public class Sorter {
    public static <T extends Comparable<T>> boolean isSorted(T[] tab){
        if(tab == null || tab.length == 0){
            return true;
        }

        for(int i = 0; i < tab.length - 1; i++){
            if(tab[i].compareTo(tab[i + 1]) > 0){
                return false;
            }
        }
        return true;
    }
}
