package transport;

import java.util.Comparator;

public class RangeComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Integer.compare(o1.getRange(), o2.getRange());
    }
}
