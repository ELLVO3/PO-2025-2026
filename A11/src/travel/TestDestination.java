package travel;

import java.util.Arrays;
import java.util.Comparator;

public class TestDestination {
    static void main(String[] args) {
        Destination[] destinations = {
                new Destination("Szczecin", "Polska", 300),
                new Destination("Hamburg", "Niemcy", 300),
                new Destination("Lyon", "Francja", 1200),
                new Destination("Madryt", "Hiszpania", 2100)
        };

        DistanceComparator distComp = new DistanceComparator();
        CountryNameComparator countryComp = new CountryNameComparator();

        Arrays.sort(destinations, new Comparator<Destination>() {
            @Override
            public int compare(Destination o1, Destination o2) {
                int distResult = distComp.compare(o1, o2);

                if(distResult != 0){
                    return distResult;
                }

                return countryComp.compare(o1, o2);
            }
        });

        for(Destination d : destinations){
            System.out.println(d);
        }
    }
}
