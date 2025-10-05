package viikko4.lab; 
public abstract class Vehicle { 
    protected String name; 

    public Vehicle(String name){
        if (name == null) {
            throw new IllegalArgumentException("Invalid name!");
        }
        this.name=name; 
    }

    public String getName(){
        return name;
    }

    public abstract Double travelTimeHours(Double km);
}
