import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class EventService {
    private static List<Event> events = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    
    public static List<Event> getEvents() {
        return events;
    }

    public static void addEvent() {
        System.out.println("Enter Event ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        if(id < 0 ){
            System.out.println("Invalid ID");
            return;
        }

        System.out.println("Enter Event Name: ");
        String name = scanner.nextLine();
      if(name.length() < 3){
    System.out.println("Invalid Name");
    return;}

        System.out.println("Enter Event local: ");
        String local = scanner.nextLine();

        if(local.length() < 3){
            System.out.println("Invalid local");
            return;
        }

        System.out.println("Enter Event Date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine().trim();
        if(getValidDate(dateInput) == null){
            return;
        }else{
            String date = getValidDate(dateInput);
            events.add(new Event(id, name, date, local));
            System.out.println("Event added successfully.");
        }

        

    }

    public static void modifyEvent() {
        System.out.println("Enter Event ID to modify: ");
        int eventId = scanner.nextInt();
        scanner.nextLine(); 
        for (Event event : events) {
            if (event.getId() == eventId) {
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                event.setName(newName);
                System.out.println("Enter new date: ");
                String newDate = scanner.nextLine();
                event.setDate(newDate);
                System.out.println("Enter new local: ");
                String newLocal = scanner.nextLine();
                event.setLocal(newLocal);
                System.out.println("Event modified successfully.");
                return;
            }
        }
        System.out.println("Event not found.");
    }

    public static void deleteEvent() {
        System.out.println("Enter Event ID to delete: ");
        int eventId = scanner.nextInt();
        events.removeIf(event -> event.getId() == eventId);
        System.out.println("Event deleted if it existed.");
    }

    public static void displayAllEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
        } else {
            for (Event event : events) {
                System.out.println("ID: " + event.getId() + ", Name: " + event.getName() + ", Date: " + event.getDate());
            }
        }
    }

    public static void searchEvent(){
        System.out.println("Enter Event ID to search: ");
        int eventId = scanner.nextInt();
        for (Event event : events) {
            if (event.getId() == eventId) {
                System.out.println("ID: " + event.getId() + ", Name: " + event.getName() + ", Date: " + event.getDate());
                return;
            }
        }
        System.out.println("Event not found.");
    
    }


    private static String getValidDate(String dateInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            
            try {
                LocalDate.parse(dateInput, formatter);
                return dateInput; 
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter a date in YYYY-MM-DD format.");
            }
            return null;
    }

}
