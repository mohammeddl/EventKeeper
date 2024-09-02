import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("Enter Event Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Event local: ");
        String local = scanner.nextLine();

        System.out.println("Enter Event Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        Event event = new Event(id, name, date, local);
        events.add(event);
        System.out.println("Event added successfully.");

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


}
