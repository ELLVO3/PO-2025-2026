package zad10;

public class VehicleManagerTest {
    public static void main(String[] args) {
        VehicleManager c1 = new Car();
        VehicleManager m1 = new Motorcycle();

        System.out.println("Samochód: ");
        System.out.println(c1.startEngine());
        System.out.println(c1.getFuelLevel());

        System.out.println();

        System.out.println("Motocykl: ");
        System.out.println(m1.startEngine());
        System.out.println(m1.getFuelLevel());
    }
}
