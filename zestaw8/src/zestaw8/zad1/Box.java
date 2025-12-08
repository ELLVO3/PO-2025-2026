package zestaw8.zad1;

public class Box<T>{
    private T obj;

    public void set(T t){
        this.obj = t;
    }

    public T get(){
        return obj;
    }
}
