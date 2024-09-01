import java.util.ArrayList;
import java.util.List;

public class UserService {
    
    private static List<Event> registerations = new ArrayList<>();
    private List<Event> events;


    public UserService(List<Event> events) {

        this.events = events;

    }

    public void registerForEvent(User user , int eventId){
        Event event = findEventById(eventId);
       if( event != null){
       registerations.add(event);
       System.out.println(user.getUserName() + " registered for event: " + event.getName());
       }else
       System.out.println("Event with ID " + eventId + " not found.");
    }

    public void viewEventRegistrations(User user) {
        if (registerations.isEmpty()) {
            System.out.println(user.getUserName() + " has no event registrations.");
        } else {
            System.out.println(user.getUserName() + "'s Event Registrations:");
            for (Event event : registerations) {
                System.out.println("ID: " + event.getId() + ", Name: " + event.getName() + ", Date: " + event.getDate());
            }
        }
    }

     public void displayAllEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
        } else {
            System.out.println("Available Events:");
            for (Event event : events) {
                System.out.println("ID: " + event.getId() + ", Name: " + event.getName() + ", Date: " + event.getDate());
            }
        }
    }

    private Event findEventById(int eventId) {
        for (Event event : events) {
            if (event.getId() == eventId) {
                return event;
            }
        }
        return null; 
    }
}
