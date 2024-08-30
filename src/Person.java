public class Person {

    private int id;
    private String userName;
    private String password;

    public Person(int id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
