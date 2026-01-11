package algorithm;

public class Sorter {
    public static <T extends Comparable<T>> boolean isSorted(T a, T b, T c){
        if(a.compareTo(b) <= 0 && b.compareTo(c) <= 0){
            return true;
        }
        return false;
    }
}
