public class Lesson_010_Objects_and_classes {
    public static void main(String[] args) {

  Book book = new Book("'������ ��������'","�����������",1881);
  Book book2 = new Book("'���� ��'","����������",1992);
  book.setPublicationYear(1883);
  Author author = new Author("������ �����", "���������", 1850, "��������, ���������");
  Author author2 = new Author("������", "�������", 1962, "������, ����");
        System.out.println("�����: " + book.getBookTitle() + "; ����: " + book.getGenre() + "; ��� ������� ������: "
                + book.getPublicationYear() + ". " + "�����: " + author.getName() + " " + author.getLastName() + ". ������� � "
                + author.getDateOfBirth() + " ����, � ������ " + author.getPlaceOfBirth() + ".");
        System.out.println("�����: " + book2.getBookTitle() + "; ����: " + book2.getGenre() + "; ��� ������� ������: "
                + book2.getPublicationYear() + ". " + "�����: " + author2.getName() + " " + author2.getLastName() + ". ������� � "
                + author2.getDateOfBirth() + " ����, � ������ " + author2.getPlaceOfBirth() + ".");
    }

}
