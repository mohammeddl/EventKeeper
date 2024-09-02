public class Event {
    private int id;
    private String name;
    private String date;
    private String local;

    public Event(int id, String name, String date,String local){
        this.id = id;
        this.name = name;
        this.date = date;
        this.local = local;
    }

    public String getName(){
        return name;
    }
    
    public void  setName(String name){
    this.name = name;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public int getId(){
        return id;
    }

    
    public void setLocal(String local){
        this.local = local;
    }

    public String getLocal(){
        return local;
        
    }
}
