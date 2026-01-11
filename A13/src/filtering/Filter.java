package filtering;

import java.util.ArrayList;

public class Filter {
    public static <T extends Comparable<T>> ArrayList<T> filterGreaterThan(ArrayList<T> tab, T target){
        ArrayList<T> result = new ArrayList<>();

        if(tab == null || target == null){
            return result;
        }

        for(T elem : tab){
            if(elem.compareTo(target) > 0){
                result.add(elem);
            }
        }
        return result;
    }
}
