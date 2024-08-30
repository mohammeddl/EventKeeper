import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Person currentUser;
    private static Admin admin = new Admin(2, "admin", "123456789");

    public static void main(String[] args) {
        boolean exit = false;
        currentUser = null;

        while (!exit) {
            showMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    changeAccount();
                    break;
                case 2:
                if (currentUser instanceof Admin) {
                    AdminMenu.display((Admin) currentUser);
                } else if (currentUser instanceof User) {
                    UserMenu.display((User) currentUser);
                } else {
                    System.out.println("No account logged in. Please change account first.");
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
        scanner.nextLine();

        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (choice == 1) {
            if (admin.getUserName().equals(userName) && admin.getPassword().equals(password)) {
                currentUser = admin;
                System.out.println("Switched to Admin account.");
            } else{
                System.out.println("Invalid username or password");
            }
        } else if (choice == 2) {
            currentUser = new User(2, userName, password);
            System.out.println("Switched to User account.");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
