package zadane_drugie.comparable_mniej_standardowy_porzadek;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMovie {
    static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Kot", "Reżyser A", "Komedia"));
        movies.add(new Movie("Avatar", "Reżyser B", "Sci-Fi"));
        movies.add(new Movie("Batman", "Reżyser C", "Akcja"));
        movies.add(new Movie("Władca Pierścieni", "Jackson", "Fantasy"));

        for(Movie m : movies){
            System.out.println(m);
        }

        Collections.sort(movies);

        for(Movie m : movies){
            System.out.println(m);
        }
    }
}
