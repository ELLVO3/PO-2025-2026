package checking;

public class Checker {
    public static <T> boolean isEitherNull(T t1, T t2){
        if(t1 == null || t2 == null) return true;

        return false;
    }
}
