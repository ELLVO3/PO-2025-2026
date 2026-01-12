package aviation;

public class TestFlightPath {
    public static void main(String[] args) {
        FlightPath f1 = new FlightPath("123456", "Olsztyn", "New York");
        FlightPath f2 = new FlightPath("8765", "Gdańsk", "Monachium");

        f1.printDetails();
        f2.printDetails();

        System.out.println(f1.isLongHaul());
        System.out.println(f2.isLongHaul());
    }
}
