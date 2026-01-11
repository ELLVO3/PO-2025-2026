package transport;

import java.util.ArrayList;

public class CityBusDepot extends BusDepot{
    private int numberOfRoutes;

    public CityBusDepot(String name, String city, ArrayList<String> buses, int numberOfRoutes) {
        super(name, city, buses);
        this.numberOfRoutes = numberOfRoutes;
    }

    public int getNumberOfRoutes() {
        return numberOfRoutes;
    }

    public void setNumberOfRoutes(int numberOfRoutes) {
        this.numberOfRoutes = numberOfRoutes;
    }

    @Override
    public String toString() {
        return "CityBusDepot{" +
                "numberOfRoutes=" + numberOfRoutes +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CityBusDepot that = (CityBusDepot) o;
        return numberOfRoutes == that.numberOfRoutes;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfRoutes;
        return result;
    }
}
