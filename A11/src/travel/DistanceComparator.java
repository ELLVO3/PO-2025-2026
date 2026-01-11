package travel;

import java.util.Comparator;

public class DistanceComparator implements Comparator<Destination> {
    public int compare(Destination d1, Destination d2){

        int dst1 = d1.getDistance();
        int dst2 = d2.getDistance();

        return Integer.compare(dst1, dst2);

    }
}
