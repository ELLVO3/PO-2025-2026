package algorithm;

public class Counter {
    public static <T> int countMatches(T[] tab, T e){
        int counter = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i].equals(e)){
                counter++;
            }
        }
        return counter;
    }
}
