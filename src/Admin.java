public class Admin extends Person {
    
    public Admin(int id , String userName, String password){
        super(id, userName, password);
    }

  public void addEvent(Event event){
    System.out.println("Event "+event.getName());
  }
}
