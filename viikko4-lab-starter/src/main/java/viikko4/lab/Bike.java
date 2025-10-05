package viikko4.lab;

public class Bike extends Vehicle {
    private Double avgSpeedKmh;

    public Bike(String name, Double s) {
        super(name);
        if(s<0){
            throw new IllegalArgumentException("Invalid distance");
        }
        this.avgSpeedKmh = s;
    }

    public Double travelTimeHours(Double km) {
         if(km<0){
            throw new IllegalArgumentException("Distance to short");
        }
        return avgSpeedKmh / km;
    }
}