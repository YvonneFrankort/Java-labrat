import java.utils.List;

public class IntStats{
    public static int min(List<Integer>luvut){
        if (luvut == null || luvut.isEmpty()){
            return 0;
        }
        int minLuku = luvut.get(0);
        for(int i =1; i < luvut.size(); i++){
            if(luvut.get(i) < minLuku){
                minLuku = luvut.get(i);
            }
        }
        return minLuku;
    }

    public static int max(List<Integer>luvut){
        if (luvut == null || luvut.isEmpty()){
            return 0;
        }
        
        int maxLuku = luvut.get(0);
        for (int i=1; i < luvut.size(); i++){
            if(luvut.get(i) > maxLuku){
                maxLuku= luvut.get(i);
            }
        }
        return maxLuku;
    }

    public static double avg(List<Integer>luvut){
        if(luvut == null || luvut.isEmpty()){
            return 0;
        }

        double sum = 0;
        for(int i=0; i<luvut.size(); i++){
            sum += luvut.get(i);
        }
        double average = sum/luvut.size();
        return Math.round(average * 100.0)/100.0;
    }
}