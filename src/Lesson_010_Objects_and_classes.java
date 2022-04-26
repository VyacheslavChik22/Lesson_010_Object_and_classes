import java.util.Objects;

public class Lesson_010_Objects_and_classes {
    public static void main(String[] args) {

        Author author = new Author("������ �����", "���������", 1850, "��������, ���������");
        Author author2 = new Author("������", "�������", 1962, "������, ����");

        Book book = new Book("'������ ��������'", "�����������", author, 1881);
        Book book2 = new Book("'���� ��'", "����������", author2, 1991);

        book.setPublicationYear(1883);


        System.out.println("\n" + book);
        System.out.println(author);
        System.out.println("\n" + book2);
        System.out.println(author2);


        System.out.println("\n��������� � ������ Book �� �������� ������������\n");

        Book bookNext = new Book("'������ ��������'", "�����������", author, 1881);
        System.out.println(book.equals(bookNext));

        System.out.println(Objects.hash(book));
        System.out.println(Objects.hash(bookNext));

        System.out.println("\n��������� � ������ Author �� ������� ������ ������������\n");

        Author authorNext = new Author("������", "�������", 1962, "������, ����");
        System.out.println(author2.equals(authorNext));

        System.out.println(Objects.hash(author2));
        System.out.println(Objects.hash(authorNext));


    }

}


