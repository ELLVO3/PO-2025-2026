package algorithm;

import java.util.Collection;

public class Cleaner {
    public static <T> void clearIfContains(Collection<T> a, T b){
        if(a == null){
            return;
        }
        if(a.contains(b)){
            a.clear();
        }
    }
}
