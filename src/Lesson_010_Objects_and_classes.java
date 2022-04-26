import java.util.Objects;

public class Lesson_010_Objects_and_classes {
    public static void main(String[] args) {

        Author author = new Author("Роберт Льюис", "Стивенсон", 1850, "Эдинбург, Шотландия");
        Author author2 = new Author("Виктор", "Пелевин", 1962, "Москва, СССР");

        Book book = new Book("'Остров сокровищ'", "Приключения", author, 1881);
        Book book2 = new Book("'Омон Ра'", "Фантастика", author2, 1991);

        book.setPublicationYear(1883);


        System.out.println("\n" + book);
        System.out.println(author);
        System.out.println("\n" + book2);
        System.out.println(author2);


        System.out.println("\nСравнение в классе Book по названию произведения\n");

        Book bookNext = new Book("'Остров сокровищ'", "Приключения", author, 1881);
        System.out.println(book.equals(bookNext));

        System.out.println(Objects.hash(book));
        System.out.println(Objects.hash(bookNext));

        System.out.println("\nСравнение в классе Author по фамилии автора произведения\n");

        Author authorNext = new Author("Виктор", "Пелевин", 1962, "Москва, СССР");
        System.out.println(author2.equals(authorNext));

        System.out.println(Objects.hash(author2));
        System.out.println(Objects.hash(authorNext));


    }

}


