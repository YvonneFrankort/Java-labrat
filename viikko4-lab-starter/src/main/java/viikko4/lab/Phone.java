package viikko4.lab; 

public class Phone extends Device implements Rechargeable { 
    private int battery; public Phone(String name,Integer b){ 
        super(name); 
        if (b == null || b < 0 || b > 100) {
            throw new IllegalArgumentException("Error");
        }
    this.battery=b;} 

public void use(Integer minutes){
    if (minutes < 0) {
        throw new IllegalArgumentException("Negative value");
    }
    int usage = minutes/5;
    battery -= usage;

    if(battery <0){
        battery =0;
    }
} 

public void recharge(Integer minutes){ 
    if(minutes >= 100){
        throw new IllegalArgumentException("Too big value");
    }

    int increase = minutes / 2;
    battery += increase;

    if(battery > 100){
        battery = 100;
    }
} 

    public Integer batteryPercent(){ 
        return battery; } 
}