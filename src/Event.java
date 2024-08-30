public class Event {
    private int id;
    private String name;
    private String date;

    public Event(int id, String name, String date){
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return name;
    }
    
    public void  setName(String name){
    this.name = name;
    }

    public String date(){
        return date;
    }
}
