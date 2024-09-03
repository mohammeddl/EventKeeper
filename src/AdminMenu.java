import java.util.Scanner;
import java.util.List;

public class AdminMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static List<User> users;

    public static void display(Admin admin) {
        boolean exit = false;

        while (!exit) {
            showAdminMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    EventService.addEvent();
                    break;
                case 2:
                    EventService.modifyEvent();
                    break;
                case 3:
                    EventService.deleteEvent();
                    break;
                case 4:
                    EventService.displayAllEvents();
                    break;
                case 5:
                    EventService.searchEvent();
                    break;
                case 6:
                showGereUsersMenu();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showAdminMenu() {
        System.out.println("\n=== Admin Menu ===");
        System.out.println("1. Add Event");
        System.out.println("2. Modify Event");
        System.out.println("3. Delete Event");
        System.out.println("4. Display All Events");
        System.out.println("5. Search for Events");
        System.out.println("6. Manage Users");
        System.out.println("7. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void showGereUsersMenu() {
        System.out.println("\n=== Admin Menu ===");
        System.out.println("2. Modify User");
        System.out.println("3. Delete User");
        System.out.println("4. Display All Users");
        System.out.println("6. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            // case 1:
            //     GareUsers.addUser();
            //     break;
            case 2:
            System.out.println("Enter User ID to modify: ");
                int userId = scanner.nextInt();
                User user = GareUsers.findUserById(userId);
                if (user != null) {
                    // Call a method to modify the user here
                    System.out.println("User found: " + user.getUserName());
                } else {
                    System.out.println("User not found.");
                }
                break;
            case 3:
            //     GareUsers.deleteUser();
            //     break;
            case 4:
                GareUsers.displayAllUsers();
                break;
            // case 5:
            //     GareUsers.searchUser();
            //     break;
            case 6:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }


    }
}
