package finding;

import java.util.HashMap;

public class Finder {
    public static <K, V> V findValueByKey(HashMap<K, V> map, K key){
        if(map == null || !map.containsKey(key)){
            return null;
        }

        return map.get(key);

    }
}
