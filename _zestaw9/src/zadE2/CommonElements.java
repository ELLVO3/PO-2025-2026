package zadE2;

import java.util.HashSet;

public class CommonElements {

    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        s1.add("Halt!");
        s1.add("Heyo!");
        s1.add("Hello!");

        s2.add("Achtung!");
        s2.add("Heyo!");

        System.out.println(commonElements(s1, s2));
    }

    public static <T> boolean commonElements(HashSet<T> set1, HashSet<T> set2){
        if(set1 == null || set2 == null){
            return false;
        }

        HashSet<T> smallerSet;
        HashSet<T> biggerSet;

        if(set1.size() < set2.size()){
            smallerSet = set1;
            biggerSet = set2;
        }
        else{
            smallerSet = set2;
            biggerSet = set1;
        }

        for(T element : smallerSet){
           if(biggerSet.contains(element)){
               return true;
           }
        }
        return false;
    }
}
