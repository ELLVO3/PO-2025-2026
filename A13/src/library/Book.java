package library;

public record Book(String title, String author, int pageCount) {

    public Book{
        if(pageCount <= 0){
            throw new IllegalArgumentException("Liczba stron nie może być mniejsza od 0.");
        }
    }

    public boolean isLongBook(){
        if(pageCount() > 300) return true;
        return false;
    }

    public void printDetails(){
        System.out.println("Title: " + title + ", Author: " + author + ", Page Count: " + pageCount);
    }
}
