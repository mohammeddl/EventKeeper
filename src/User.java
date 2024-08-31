public class User extends Person {

    public User(int id, String userName, String password) {
        super(id, userName, password);
    }
    
    public void viewRegistrations(){
        System.out.println("Viewing registrations for" + getUserName());
    }

    public void registerForEvent(Event event) {
        System.out.println(getUserName() + " has registered for " + event.getName());
    }
}
