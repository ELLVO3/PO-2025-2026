package zadK2;

import java.util.HashMap;
import java.util.Map;

public class Swapper {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Matthew Pelo");
        students.put(2, "Unknown Unknown");
        students.put(3, "Maciej Wojciechowski");

        System.out.println("Original map: " + students);

        HashMap<String, Integer> reversedStudents = swapKeysAndValues(students);

        System.out.println("Reversed map: " + reversedStudents);
    }

    public static <K, V> HashMap<V, K> swapKeysAndValues(HashMap<K, V> map){
        HashMap<V, K> swapped = new HashMap<>();

        if(map == null){
            return swapped;
        }

        for(Map.Entry<K, V> entry : map.entrySet()){
            K originalKey = entry.getKey();
            V originalValue = entry.getValue();

            swapped.put(originalValue, originalKey);
        }
        return swapped;
    }
}
