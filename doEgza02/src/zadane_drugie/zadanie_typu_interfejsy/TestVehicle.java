package zadane_drugie.zadanie_typu_interfejsy;

public class TestVehicle {
    public static void main(String[] args) {

        // 1. Testowanie metody statycznej z interfejsu (wywołujemy bez tworzenia obiektu)
        System.out.println("--- Test metody statycznej ---");
        System.out.println(Vehicle.info());

        // Tworzenie obiektu klasy Car
        Car myCar = new Car();

        System.out.println("\n--- Test metod abstrakcyjnych (zaimplementowanych w Car) ---");

        // 2. Test startEngine - przypadek poprawny
        myCar.startEngine("benzyna");
        myCar.startEngine("diesel");

        // 2. Test startEngine - przypadek błędny
        myCar.startEngine("woda");

        // 3. Test canDrive
        boolean canGo = myCar.canDrive(10);
        System.out.println("Czy może jechać (poziom 10): " + canGo); // powinno być true

        boolean cannotGo = myCar.canDrive(3);
        System.out.println("Czy może jechać (poziom 3): " + cannotGo); // powinno być false

        System.out.println("\n--- Test metod domyślnych (z interfejsu) ---");

        // 4. Test metod domyślnych
        myCar.honk();
        myCar.stop();
    }
}
