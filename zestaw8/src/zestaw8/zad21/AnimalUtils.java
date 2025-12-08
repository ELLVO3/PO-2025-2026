package zestaw8.zad21;

public class AnimalUtils {
    public static <T extends Animal> T findMax(T element1, T element2){
        if(element1.getAge() >= element2.getAge()){
            return element1;
        }
        return element2;
    }
}
