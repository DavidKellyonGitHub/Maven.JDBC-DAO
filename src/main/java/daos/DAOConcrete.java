package daos;

import java.sql.*;
import java.util.List;

public class DAOConcrete implements DAO {
    static String user = "java";
    static String password = "java";
    static String url = "jdbc:postgresql://localhost:5432/person";

    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to postgresql server.");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }



    public Object findbyID(int id) {
        String SQL = "SELECT id FROM person WHERE ID = "+ id;
        int personID = 0;
        String personFirstName = "";
        String personLastName = "";
        String personEmail = "";
        String personGender = "";
        String personDateOfBirth = "";
        String personCountryOfBirth = "";

        try (Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                personID = rs.getInt(1);
                personFirstName = rs.getString(2);
                personLastName = rs.getString(3);
                personEmail = rs.getString(4);
                personGender = rs.getString(5);
                personDateOfBirth = rs.getString(6);
                personCountryOfBirth = rs.getString(7);
            }
        }catch (SQLException e){
                System.out.println(e.getMessage());
            }

        return new DTOClass(personID,personFirstName,personLastName,personEmail,personGender,personDateOfBirth,personCountryOfBirth);
    }

    public List findAll() {
        String SQL = "SELECT id FROM person WHERE ID > 5 ";
        List personList = new List<DTOClass>;
        int personID = 0;
        String personFirstName = "";
        String personLastName = "";
        String personEmail = "";
        String personGender = "";
        String personDateOfBirth = "";
        String personCountryOfBirth = "";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                personID = rs.getInt(1);
                personFirstName = rs.getString(2);
                personLastName = rs.getString(3);
                personEmail = rs.getString(4);
                personGender = rs.getString(5);
                personDateOfBirth = rs.getString(6);
                personCountryOfBirth = rs.getString(7);
                personList.add(new DTOClass(personID,personFirstName,personLastName,personEmail,personGender,personDateOfBirth,personCountryOfBirth));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return personList;
    }

    @Override
    public Object update(Object dto) {
        return null;
    }

    public DTOClass update(DTOClass dto) {
        String SQL = "INSERT INTO person (id,first_name,last_name,email,gender,date_of_birth,country_of_birth) values ("+dto.getID()+","+dto.getFirst_Name(),dto.getLastName,dto.getEmail,dto.get);"
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                personID = rs.getInt(1);
                personFirstName = rs.getString(2);
                personLastName = rs.getString(3);
                personEmail = rs.getString(4);
                personGender = rs.getString(5);
                personDateOfBirth = rs.getString(6);
                personCountryOfBirth = rs.getString(7);
                personList.add(new DTOClass(personID,personFirstName,personLastName,personEmail,personGender,personDateOfBirth,personCountryOfBirth));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return personList;

        return null;
    }

    public void delete(int id) {

    }
}
