package transport;

public class TestBusRoute {
    public static void main(String[] args) {
        BusRoute b1 = new BusRoute("130", "Dworzec Główny", "Stary Dwór");
        BusRoute b2 = new BusRoute("12790", "Dworzec Główny", "Słoneczny Stok");

        b1.printDetails();
        b2.printDetails();

        System.out.println(b1.isLongRoute());
        System.out.println(b2.isLongRoute());
    }
}
