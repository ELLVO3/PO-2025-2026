package zestaw8.zad3;

import java.util.ArrayList;

public class Counter<T> {
    private ArrayList<T> array = new ArrayList<>();

    public void add(T element){
        array.add(element);
    }

    public int getCount(){
        return array.size();
    }
}
