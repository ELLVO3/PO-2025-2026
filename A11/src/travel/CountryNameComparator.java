package travel;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Destination> {

    public int compare(Destination a, Destination b){
        String c1 = a.getCountry();
        String c2 = b.getCountry();

        int result = c2.compareTo(c1);

        if(result != 0){
            return result;
        }

        return b.getName().compareTo(a.getName());
    }
}
