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
        if (this.getClass() != other.getClass()) {
            return false;
        } else {
            Book bookNext = (Book) other;
            return bookTitle.equals(bookNext.bookTitle);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle);
    }

    @Override
    public String toString() {
        return "Роман: " + bookTitle + " Жанр: " + genre + ". Автор: " + author.getName() + " " + author.getLastName() + "." +
                " Год издания романа: " + publicationYear;
    }

}