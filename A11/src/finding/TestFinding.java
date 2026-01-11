package finding;

import java.util.HashMap;

public class TestFinding {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Polska", 1);
        hm.put("Niemcy", 2);

        System.out.println("Szukane: 1... -> " + Finder.findValueByKey(hm, "Polska"));
        System.out.println("Szukane: 2... -> " + Finder.findValueByKey(hm, "Niemcy"));
        System.out.println("Szukane: 3... -> " + Finder.findValueByKey(hm, "Francja"));
        System.out.println("Szukane: ?... -> " + Finder.findValueByKey(null, "Portugalia"));
    }
}
