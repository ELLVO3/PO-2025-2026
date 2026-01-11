package sorting;

import java.util.Arrays;

public class Sort {
    public static <T extends Comparable<? super T>> void sortAscending(T[] tab){
        Arrays.sort(tab);
    }
}
