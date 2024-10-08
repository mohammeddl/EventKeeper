import java.util.List;
import java.util.Scanner;


public class UserMenu {
    private static Scanner scanner = new Scanner(System.in);



    public static void display(User user, UserService userService, List<Event> events) {
        boolean exit = false;

        while (!exit) {
            showUserMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Event ID to register: ");
                    int eventId = scanner.nextInt();
                    userService.registerForEvent(user, eventId);
                    break;
                case 2:
                userService.viewEventRegistrations(user);
                break;
                    
                case 3:
                EventService.displayAllEvents();
                    break;
                    
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showUserMenu() {
        System.out.println("\n=== User Menu ===");
        System.out.println("1. Register for Event");
        System.out.println("2. View Event Registrations");
        System.out.println("3. Display All Events");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

   
}
