public class Lesson_010_Objects_and_classes {
    public static void main(String[] args) {

        Book book = new Book("'Остров сокровищ'", "Приключения", "Роберт Льюис Бэлфур Стивенсон", 1881);
        Book book2 = new Book("'Омон Ра'", "Фантастика", "Виктор Олегович Пелевин", 1991);

        book.setPublicationYear(1883);

        Author author = new Author("Роберт Льюис", "Стивенсон", 1850, "Эдинбург, Шотландия");
        Author author2 = new Author("Виктор", "Пелевин", 1962, "Москва, СССР");


        System.out.println();
        System.out.println("Роман: " + book.getBookTitle() + "; Жанр: " + book.getGenre() + "; Год издания романа: "
                + book.getPublicationYear() + ". Автор: " + book.getAuthor() + ". ");
        System.out.println("Писатель и поэт: " + author.getName() + " " + author.getLastName() + ". Родился в "
                + author.getDateOfBirth() + " году, в городе " + author.getPlaceOfBirth() + ".");
        System.out.println();

        System.out.println("Роман: " + book2.getBookTitle() + "; Жанр: " + book2.getGenre() + "; Год издания романа: "
                + book2.getPublicationYear() +". Автор: "+ book2.getAuthor() + ". ");

        System.out.println("Русский писатель: " + author2.getName() + " " + author2.getLastName() + ". Родился в "
                + author2.getDateOfBirth() + " году, в городе " + author2.getPlaceOfBirth() + ".");
    }

}
