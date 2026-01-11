package tourism;

public class TestHotel {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hotel h1 = new Hotel("Coco", 32.0);

        Hotel h2 = h1.clone();

        System.out.println("Original: " + h1);
        System.out.println("Clone: " + h2);

        h1.setName("Palm Tree");
        h1.setCapacity(30.0);

        System.out.println("Original: " + h1);
        System.out.println("Clone: " + h2);
    }
}
