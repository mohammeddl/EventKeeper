import java.util.Scanner;

public class AdminMenu {
    private static Scanner scanner = new Scanner(System.in);

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
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }
}
