package viikko4.lab; 
public final class TravelUtils { 
    private TravelUtils(){

    } 
    public static Double sumTravelTimes(Vehicle[] arr, Double km){ 
        if(km == null || km <= 0){
            throw new IllegalArgumentException("Wrong input");
        }
        if(arr== null){
            throw new IllegalArgumenteXCEPTION("Array empty");
        }

        double sum = 0.0;

        for (Vehicle v : arr){
            if (v != null){
                sum += v.travelTime(km);
            }
        }
        return sum;
    } 

}