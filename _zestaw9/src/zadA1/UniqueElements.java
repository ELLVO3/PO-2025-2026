package zadA1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static <T> void printUnique(Collection <T> items){

        Set<T> uniqueItems = new HashSet<>(items);

        for(T item : uniqueItems){
            System.out.println(item);
        }
    }
}
