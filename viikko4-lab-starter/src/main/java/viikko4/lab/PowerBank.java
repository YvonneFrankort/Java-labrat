package viikko4.lab; 

public class PowerBank extends Device implements Rechargeable { 
    private int battery; 

public PowerBank(String name,Integer b){ 
    super(name); 
    if (b == null || b < 0 || b > 100) {
            throw new IllegalArgumentException("Error");
        }
this.battery=b;} 

public void recharge(Integer minutes){ 
    if(minutes < 0){
        throw new IllegalArgumentException("Minus value");
    }

    int increase = minutes / 1;
    battery += increase;

    if(battery > 100){
        battery = 100;
    }
} 

public void discharge(Integer minutes){ 
    if (minutes < 0) {
        throw new IllegalArgumentException("Negative value");
    }
    int usage = minutes/3;
    battery -= usage;

    if(battery <0){
        battery =0;
    }
} 

    public Integer batteryPercent(){ 
        return battery; } 
}