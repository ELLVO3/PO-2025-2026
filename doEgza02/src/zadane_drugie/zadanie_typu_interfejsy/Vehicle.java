package zadane_drugie.zadanie_typu_interfejsy;

public interface Vehicle {
    void startEngine(String fuelType);
    boolean canDrive(int fuelLevel);

    default void stop(){
        System.out.println("Zatrzymano pojazd.");
    }

    default void honk(){
        System.out.println("HONK!");
    }

    static String info(){
        return "Info ogólne.";
    }
}
