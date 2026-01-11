package sorting;

public class Sorting {
    public static <T extends Comparable<T>> void sortDescending(T[] tab){
        for(int i = 0; i < tab.length - 1; i++){
            for(int j = 0; j < tab.length - 1 - i; j++){
                if(tab[j].compareTo(tab[j+1]) < 0){
                    T temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
    }
}
