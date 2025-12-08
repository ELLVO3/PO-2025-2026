package zestaw8.zad12;

public class TestGenericUtils {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4};

        for(Integer i : array){
            System.out.println(i + " ");
        }

        System.out.println();

        GenericUtils.swap(array, 0, 2);

        for(Integer i : array){
            System.out.println(i + " ");
        }
    }
}
