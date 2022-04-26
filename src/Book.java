import java.util.Objects;

public class Book {

    private String bookTitle;
    private String genre;
    private Author author;
    private int publicationYear;

    public Book(String bookTitle, String genre, Author author, int publicationYear) {
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

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return Objects.equals(bookTitle, book.bookTitle) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, genre);
    }

    @Override
    public String toString() {
        return "Novel: " + bookTitle + " Genre: " + genre + ". Author: " + author.getName() + " " + author.getLastName() + "." +
                " The year of publication of the novel: " + publicationYear;
    }
}