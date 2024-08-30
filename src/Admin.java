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

}
