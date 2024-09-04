import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GareUsers {
    
    private static List<User> users = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);


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


    public static void addNewUser(){
System.out.println("Enter User ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter User Name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter User Password: ");
        String password = scanner.nextLine();
        User user = new User(id, userName, password);
        users.add(user);
        System.out.println("User added successfully: " + user.getUserName());
    }


    public static List<User> getUsers(){
        return users;
    }
}

