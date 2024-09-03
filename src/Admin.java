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

    public void displayAllUsers(User user) {
        System.out.println("Displaying all users...");
        System.out.println("ID: " + user.getId() + ", Name: " + user.getUserName()+ ", Password: " + password);
    }
}
