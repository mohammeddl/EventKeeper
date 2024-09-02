import java.util.ArrayList;
import java.util.List;

public class UserService {
    
    private static List<Event> registerations = new ArrayList<>();
    private List<Event> events;

    public UserService() {
        
        this.events = EventService.getEvents();
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

     

    private Event findEventById(int eventId) {
        
        System.out.println("Searching for Event ID: " + eventId + " in the events list:");
        for (Event event : events) {
            System.out.println("Checking Event ID: " + event.getId());
            if (event.getId() == eventId) {
                return event;
            }
        }
        return null; 
    }
    
}
