public class Book {
    private String bookTitle;
    private String genre;
    private int publicationYear;

    public Book(String bookTitle, String genre, int publicationYear) {
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}
