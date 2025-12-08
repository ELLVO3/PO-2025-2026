package zestaw8.zad24;

public class BirdUtils {
    public static Bird findMin(Triple<? extends Bird> triple){
        Bird b1 = triple.getFirst();
        Bird b2 = triple.getSecond();
        Bird b3 = triple.getThird();

        Bird min = b1;
        if(b2.getWeight() < min.getWeight()){
            min = b2;
        }
        if(b3.getWeight() < min.getWeight()){
            min = b3;
        }
        return min;
    }
}
