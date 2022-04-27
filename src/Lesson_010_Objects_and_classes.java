import java.util.Objects;

public class Lesson_010_Objects_and_classes {
    public static void main(String[] args) {

        Author author = new Author("Robert louis", "Stevenson", 1850, "Edinburgh, Scotland");
        Author author2 = new Author("Viktor", "Pelevin", 1962, "Moscow, the USSR");

        Book book = new Book("'Treasure Island'", "Adventures", author, 1881);
        Book book2 = new Book("'Omon Ra'", "Fantasy", author2, 1991);

        book.setPublicationYear(1883);


        System.out.println("\n" + book);
        System.out.println(author);
        System.out.println("\n" + book2);
        System.out.println(author2);


        System.out.println("\nComparison in the Book class by name and genre of the book\n");

        Book bookNext = new Book("'Treasure Island'", "Adventures", author, 1881);
        System.out.println(book.equals(bookNext));

        System.out.println(Objects.hash(book));
        System.out.println(Objects.hash(bookNext));

        System.out.println("\nComparison in the Author class by the name and last name, and place of Birth of the author of the book\n");

        Author authorNext = new Author("Viktor", "Pelevin", 1962, "Moscow, the USSR");
        System.out.println(author2.equals(authorNext));
        System.out.println(Objects.hash(author2));
        System.out.println(Objects.hash(authorNext));


    }

}


