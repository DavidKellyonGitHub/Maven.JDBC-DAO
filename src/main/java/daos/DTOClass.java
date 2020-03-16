package daos;

public class DTOClass implements DTO {
    int id = 0;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getCountry_of_birth() {
        return country_of_birth;
    }

    String first_name;
    String last_name;
    String email;
    String gender;
    String date_of_birth;
    String country_of_birth;

    //for retrieval from table
    public DTOClass(int id, String first_name, String last_name, String email, String gender, String date_of_birth, String country_of_birth){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.country_of_birth = country_of_birth;
    }

    //for insertion into table with serialized ID
    public DTOClass(String first_name, String last_name, String email, String gender, String date_of_birth, String country_of_birth) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.country_of_birth = country_of_birth;
    }

    public int getID() {
        return this.id;
    }
}