package furnituredesign;

public class TestFurnitureSet {
    public static void main(String[] args) throws CloneNotSupportedException {
        FurnitureSet f1 = new FurnitureSet("Kanapa", 6.0);
        FurnitureSet f2 = new FurnitureSet("Fotel", 12.0);

        System.out.println("Oryginał: " + f1);
        System.out.println("Oryginał: " + f2);

        FurnitureSet f3 = f1.clone();
        FurnitureSet f4 = f2.clone();

        System.out.println("Kopia f1: " + f3);
        System.out.println("Kopia f2: " + f4);

        f1.setName("Biórko");
        f1.setNumberOfItems(3.0);

        System.out.println("Oryginał (po zmianie): " + f1);
        System.out.println("Oryginał: " + f2);

        System.out.println("Kopia f1: " + f3);
        System.out.println("Kopia f2: " + f4);
    }
}
