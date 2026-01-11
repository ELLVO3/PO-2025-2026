package transport;

import java.util.Arrays;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[] v = {new Vehicle("V70", "Samochód", 1000),
                new Vehicle("Golf", "Samochód", 800),
                new Vehicle("Clio", "Samocód", 800),
                new Vehicle("Ninja", "Motocykl", 300),
                new Vehicle("CBR", "Motocykl", 300)};

        for(Vehicle v1 : v){
            System.out.println(v1);
        }

        Arrays.sort(v, new RangeComparator().thenComparing(new TypeModelComparator()));

        System.out.println();

        for(Vehicle v1 : v){
            System.out.println(v1);
        }
    }
}
