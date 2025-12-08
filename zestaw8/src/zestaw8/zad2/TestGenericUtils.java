package zestaw8.zad2;

public class TestGenericUtils {
    public static void main(String[] args) {
        String obj1 = "123";
        Integer obj2 = 123;

        System.out.println(GenericUtils.isEqual(obj1, obj2));
        System.out.println(GenericUtils.isEqual(obj1, "321"));
        System.out.println(GenericUtils.isEqual(obj2, 123));
    }
}
