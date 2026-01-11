package transport;

import java.util.ArrayList;

public class TestBusDepot {
    public static void main(String[] args) {
        ArrayList<String> b1 = new ArrayList<>();

        b1.add("NKE 10909");
        b1.add("NKE 30461");

        BusDepot bd1 = new BusDepot("Zajezdnia Północna", "Kętrzyn", b1);

        System.out.println(bd1);

        bd1.addBus("NKE 46280");
        bd1.removeBus("NKE 10909");

        System.out.println(bd1);

        ArrayList<String> b2 = new ArrayList<>();

        b2.add("NO 10000");
        b2.add("NO 20000");

        CityBusDepot bd2 = new CityBusDepot("Zajezdnia Główna", "Olsztyn", b2, 30);

        System.out.println(bd2);

        bd2.removeBus("NO 10000");

        System.out.println(bd2);

        System.out.println(bd2.getCity());

        System.out.println(bd1.equals(bd2));

        System.out.println(bd1.hashCode() == bd2.hashCode());

    }
}
