package zadane_drugie.rekord_i_komparator;

import java.util.Comparator;

public class DurationTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int durationResult = Integer.compare(o1.duration(), o2.duration());

        if(durationResult != 0){
            return durationResult;
        }
        return o1.title().compareTo(o2.title());
    }
}
