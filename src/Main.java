import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Person currentUser;
    private static User user = new User(1, "mohammed", "123456789");
    private static Admin admin = new Admin(2, "admin", "123456789");

    public static void main(String[] args) {
        boolean exit = false;
        currentUser = admin;

        while (!exit) {
            showMainMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    changeAccount();
                    break;
                case 2:
                    if (currentUser instanceof Admin) {
                        AdminMenu.display(admin);
                    } else if (currentUser instanceof User) {
                        // UserMenu.display(user);
                    } else {
                        System.out.println("Unknown account type.");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("\n=== Event Management Main Menu ===");
        System.out.println("1. Change Account (Admin/User)");
        System.out.println("2. Display Menu for Current Account");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void changeAccount() {
        System.out.println("Choose an account to switch to:");
        System.out.println("1. Admin");
        System.out.println("2. User");
        int choice = scanner.nextInt();

        if (choice == 1) {
            currentUser = admin;
            System.out.println("Switched to Admin account.");
        } else if (choice == 2) {
            currentUser = user;
            System.out.println("Switched to User account.");
        } else {
            System.out.println("Invalid choice. Staying on the current account.");
        }
    }
}
