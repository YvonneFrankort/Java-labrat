import java.util.HashMap;

public class PhoneBook{
    HashMap<String, String>phone = new HashMap<String, String>();

    public void add(String name, String number){
        phone.put(name, number);
    }
    
    public String find(String name){
        return phone.get(name);

    }

    public int size(){
        return phone.size();
    }

}