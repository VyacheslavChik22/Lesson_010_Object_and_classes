import java.util.Objects;

public class Author {
    private String name;
    private String lastName;
    private int dateOfBirth;
    private String placeOfBirth;

    public Author(String name, String lastName, int dateOfBirth, String placeOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
    }


    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName) && Objects.equals(placeOfBirth, author.placeOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, placeOfBirth);
    }

    @Override
    public String toString() {
        return "Writer: " + name + " " + lastName + ". Was born in " + dateOfBirth + " year, in the town " + placeOfBirth + ".";
    }
}

