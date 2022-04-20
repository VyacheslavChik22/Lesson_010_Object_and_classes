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


     public String getName(){
          return this.name;
     }
     public String getLastName(){
          return this.lastName;
     }
     public int getDateOfBirth(){
          return this.dateOfBirth;
     }
     public String getPlaceOfBirth(){
          return this.placeOfBirth;
     }



}
