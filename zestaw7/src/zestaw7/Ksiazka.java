package zestaw7;

import java.time.LocalDate;
import java.util.Objects;

public class Ksiazka implements Comparable<Ksiazka>{
    private String tytul;
    private String autor;
    private LocalDate dataWydania;
    final int ISBN;

    public Ksiazka(String tytul, String autor, LocalDate dataWydania, int ISBN) {
        this.tytul = tytul;
        this.autor = autor;
        this.dataWydania = dataWydania;
        this.ISBN = ISBN;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(LocalDate dataWydania) {
        this.dataWydania = dataWydania;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book: \n" + "Title: " + tytul + '\'' +
                "Author: " + autor + '\'' +
                "Date of publication: " + dataWydania +
                "ISBN: " + ISBN + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ksiazka ksiazka = (Ksiazka) o;

        return Objects.equals(ISBN, ksiazka.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    @Override
    public int compareTo(Ksiazka other){
        int titleResult = this.tytul.compareTo(other.tytul);

        if(titleResult != 0){
            return  titleResult;
        }
        return this.autor.compareTo(other.autor);
    }
}
