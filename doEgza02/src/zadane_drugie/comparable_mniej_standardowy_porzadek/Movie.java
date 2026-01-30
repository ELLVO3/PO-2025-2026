package zadane_drugie.comparable_mniej_standardowy_porzadek;

public class Movie implements Comparable<Movie>{
    private String title, director, genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public int compareTo(Movie o) {
        int lengthComp = Integer.compare(o.title.length(), this.title.length());

        if(lengthComp != 0){
            return lengthComp;
        }
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
