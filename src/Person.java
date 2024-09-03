public class Person {

    protected int id;
    protected String userName;
    protected String password;

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
