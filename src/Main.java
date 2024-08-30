import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static Person currentUser;

    private static User user = new User(1,"mohammed","123456789");
    private static Admin admin = new Admin(2, "admin","123456789");

    private static List<Event> events = new ArrayList<>();

    public static void main(String[] args){

    
        boolean exit = false;
        currentUser = admin;
    
        while(!exit){
            showMainMenu();
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                changeAccount();
            break;
                case 2:
                if (currentUser instanceof Admin) {
                    menuAdmin(admin);
                   
                } else {
                    System.out.println("Unknown account type.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private static void showMainMenu(){

        System.out.println("\n=== Event Management Main Menu ===");
        System.out.println("1. Change Account (Admin/User)");
        System.out.println("2. Display Menu for Current Account");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        

    }


    private static void changeAccount(){
        System.out.println("Choose an account to switch to:");
        System.out.println("1. Admin");
        System.out.println("2. User");
        int choice = scanner.nextInt();

        if(choice== 1){
            currentUser = admin;
            System.out.println("Switched to Admin account.");
        }else if (choice == 2){
            currentUser = user;
            System.out.println("Switched to user account.");
        }else{
            System.out.println("invalid choice Staying on the current account.");
        }
    }

    private static void menuAdmin(Admin admin){

        boolean exit = false;
        
    
        while(!exit){
            showAdminMenu();
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                addEvent(admin);
                break;
                

                case 5:
                exit = true;
                break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }

    private static void showAdminMenu(){
        System.out.println("\n=== Admin Menu ===");
        System.out.println("1. Add Event");
        System.out.println("2. Modify Event");
        System.out.println("3. Delete Event");
        System.out.println("4. Display All Events");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void showUserMenu() {
        System.out.println("\n=== User Menu ===");
        System.out.println("1. Register for Event");
        System.out.println("2. View Event Registrations");
        System.out.println("3. Display All Events");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }


    private static void addEvent(Admin admin){
        System.out.println("Enter your id: ");
        int idEvent = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name event: ");
        String nameEvent = scanner.nextLine();
        
        System.out.println("Enter Event Date (YYYY-MM-DD): ");
        String dateEvent = scanner.nextLine();

        System.out.println(nameEvent+" your event create successfully ");
        Event event = new Event(idEvent, nameEvent, dateEvent);
        events.add(event);

    }
}
