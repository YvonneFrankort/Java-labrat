package viikko4.lab;

public class Thermometer implements Measurable { 
    private Double celsius; 

    public Thermometer(Double c){
        if (c == null) {
            throw new IllegalArgumentException("Invalid Temperature!");
        }
    this.celsius=c;} 

    @override
    public Double measure(){
        return celsius;} 
    }