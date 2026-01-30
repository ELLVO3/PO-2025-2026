package zadane_drugie.cloneable_ze_zmiennym_polem_referencyjnym;

public class TestKitchen {
    static void main(String[] args) {
        Stove myStove = new Stove(4, "Beko", "A6381");
        Kitchen original = new Kitchen("Kuchnia domowa", myStove);
        try{
            Kitchen cloned = original.clone();

            System.out.println("Oryginał: " + original);
            System.out.println("Klon: " + cloned);

            System.out.println(original.equals(cloned));
            System.out.println(original.hashCode());
            System.out.println(cloned.hashCode());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
