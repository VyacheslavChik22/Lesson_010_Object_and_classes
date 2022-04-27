import java.util.Objects;

public class Author {
    private String name;
    private String lastName;


    public Author(String name, String lastName, int dateOfBirth, String placeOfBirth) {
        this.name = name;
        this.lastName = lastName;

    }


    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }



    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return  name + " " + lastName;
    }
}

