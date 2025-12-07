package zestaw7;

import java.util.ArrayList;

public class Biblioteka implements Comparable<Biblioteka> {
    public Punkt3D localization;
    public ArrayList<Ksiazka> listOfBooks;

    public Biblioteka(Punkt3D localization, ArrayList<Ksiazka> listOfBooks) {
        this.localization = localization;
        this.listOfBooks = new ArrayList<>(listOfBooks);
    }

    public void addBook(Ksiazka b){
        this.listOfBooks.add(b);
    }

    @Override
    public String toString() {
        return "Library in: " + localization + ", number of books: " + listOfBooks.size() + ".";
    }

    @Override
    public int compareTo(Biblioteka other){
        int sizeDiff = Integer.compare(other.listOfBooks.size(), this.listOfBooks.size());

        if(sizeDiff != 0){
            return sizeDiff;
        }

        return Double.compare(other.localization.z(), this.localization.z());
    }
}
