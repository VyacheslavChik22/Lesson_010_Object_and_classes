public class Book {

    private String bookTitle;
    private String genre;
    private String author;
    private int publicationYear;

    public Book(String bookTitle, String genre, String author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getGenre() {
        return this.genre;
    }
    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}
