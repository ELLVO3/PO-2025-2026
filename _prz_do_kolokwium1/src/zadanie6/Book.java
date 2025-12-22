package zadanie6;

import java.time.Year;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private static int instanceCount = 0;

    public Book(String title, String author, int publicationYear) {

        if(publicationYear > Year.now().getValue()){
            throw new IllegalArgumentException("Rok wydania nie może być większy od aktualnego roku!");
        }

        if((title == null || title.isBlank()) || (author == null || author.isBlank())){
            throw new IllegalArgumentException("Tytuł i autor nie mogą być null lub być puste!");
        }

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        instanceCount++;
    }

    public static int currentInstanceCount(){
        return instanceCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("Tytuł nie może być null lub pusty!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || author.isBlank()){
            throw new IllegalArgumentException("Autor nie może być null lub pusty");
        }
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear > Year.now().getValue()){
            throw new IllegalArgumentException("Rok wydania nie może być większy od aktualnego roku!");
        }
        this.publicationYear = publicationYear;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void setInstanceCount(int instanceCount) {
        Book.instanceCount = instanceCount;
    }

    @Override
    public String toString() {
        return "Book: " +
                "[" + title +
                "] by [" + author +
                "], Published: [" + publicationYear +
                "].";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
