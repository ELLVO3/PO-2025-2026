package zestaw8.zad2;

public class GenericUtils {

    public static <T> boolean isEqual(T obj1, T obj2){
        if(obj1 == obj2) return true;
        if(obj1 == null || obj2 == null) return  false;
        return obj1.equals(obj2);
    }
}
