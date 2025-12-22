package zadC2;

import java.util.ArrayList;

public class Duplicates {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(3);
        ints.add(4);

        System.out.println(ints);

        ArrayList<Integer> intsWoDuplicates = removeDuplicates(ints);

        System.out.println(intsWoDuplicates);
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> result = new ArrayList<>();

        for(T item : list){
            if(!result.contains(item)){
                result.add(item);
            }
        }
        return result;
    }
}
