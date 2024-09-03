import java.util.List;
import java.util.ArrayList;

public class GareUsers {
    
    private static List<User> users = new ArrayList<>();



    public static void addUser(User user){
        users.add(user);
        System.out.println("User added successfully: " + user.getUserName());
    }

    public static void displayAllUsers() {
        System.out.println("Displaying all users...");
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Name: " + user.getUserName());
            }
        }
    }


    public static void findUserById(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                System.out.println("User found: " + user.getUserName());
            }
        }
        
    }

    public static void deleteUser(int userId){
        users.remove(userId);
        System.out.println("User deleted successfully.");
    }
}
