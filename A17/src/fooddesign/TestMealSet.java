package fooddesign;

import java.util.ArrayList;

public class TestMealSet {
    public static void main(String[] args) {
        try{
            MealSet m1 = new MealSet("Zestaw Śnadaniowy", 4.0);

            MealSet m2 = m1.clone();

            System.out.println("Oryginał: " + m1);
            System.out.println("Kopia: " + m2);

            m1.setName("Zestaw Obiadowy");
            m1.setNumberOfItems(10.0);

            System.out.println("Oryginał (zmieniony): " + m1);
            System.out.println("Kopia: " + m2);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
