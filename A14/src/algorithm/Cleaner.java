package algorithm;

import java.util.Collection;

public class Cleaner {
    public static <T> void clearIfContains(Collection<T> kolekcja, T treshold){

        if(kolekcja == null){
            return;
        }

        if(kolekcja.contains(treshold)){
            kolekcja.clear();
        }
    }
}
