package zestaw8.zad22;

public class CarUtils {
    public static <T extends Car> boolean compareObjects(T obj1, T obj2){
        if(obj1.getClass() == obj2.getClass()){
            return true;
        }
        return false;
    }
}
