import java.util.List;

public class Admin extends Person {

  
    
    public Admin(int id , String userName, String password){
        super(id, userName, password);


      }
      
      public  String getUserName(){
          return userName;
      
      }

      public String getPassword(){
   
     return password;

     }

    

    
    public void generateEventReport() {
        List<User> users = GareUsers.getUsers(); 
        List<Event> registrations = UserService.getRegisterations(); 
        System.out.println("\n=== Report ===");
    
       
        System.out.println("\n=== Registrations ===");
        if (registrations.isEmpty()) {
            System.out.println("No event registrations.");
        } else {
            for (Event registration : registrations) {
                System.out.println("ID: " + registration.getId() + ", Name: " + registration.getName() 
                    + ", Date: " + registration.getDate() + ", Local: " + registration.getLocal());
            }
        }

        System.out.println("\n=== All Users ===");
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Name: " + user.getUserName());
            }
        }
    }
    
}
