package zadanie_pierwsze.zadanie_z_polem_jako_tablica;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        if(ratings != null){
           this.ratings = Arrays.copyOf(ratings, ratings.length);
        }
        else{
            this.ratings = new double[0];
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(double[] ratings) {
        if(ratings != null){
            this.ratings = Arrays.copyOf(ratings, ratings.length);
        }
        else{
            this.ratings = new double[0];
        }
    }

    public void addRatings(double rating){
        double[] newRatings = Arrays.copyOf(ratings, ratings.length + 1);
        newRatings[ratings.length] = rating;
        this.ratings = newRatings;
    }

    public void removeRating(double ratingToRemove){
        int idxToRemove = -1;
        for(int i = 0; i < ratings.length; i++){
            if(Double.compare(ratings[i], ratingToRemove) == 0){
                idxToRemove = i;
                break;
            }
        }

        if(idxToRemove != -1){
            double[] newRatings = Arrays.copyOf(ratings, ratings.length - 1);
            System.arraycopy(ratings, 0, newRatings, 0, idxToRemove);
            System.arraycopy(ratings, idxToRemove + 1, newRatings, idxToRemove, ratings.length - idxToRemove - 1);
            this.ratings = newRatings;
        }
        else System.out.println("Nie ma takiego rate'ingu.");
    }

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() +
                "], [" + title +
                "], [" + producer +
                "], " + Arrays.toString(ratings) +
                ".";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(producer);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}
