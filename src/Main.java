import service.UserService;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserService();

        // CREATE
        us.addUser("John", "Doe", "teacher", "john@example.com",
                "123456", "male", Date.valueOf("1990-01-01"),
                "87081112233", "Astana");

        // READ
        us.readUsers();

        // UPDATE
        us.updateEmail(1, "john_new@mail.com");

        // DELETE
        us.deleteUser(1);
    }
}


