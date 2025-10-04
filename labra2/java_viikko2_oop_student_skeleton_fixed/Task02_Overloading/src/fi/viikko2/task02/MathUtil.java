/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {
    
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int[] number){
        int total = 0;
        for (int n : number){
            total += n;
        }
        return total;
    }

    public static double sum(double[] number){
        double total = 0;
        for (double n : number){
            total += n;
        }
        return total;
    }

    public static int max(int[] number){
        if (number == null || number.length == 0){
            throw new IllegalArgumentException();
        }
        int maxValue = number[0];
        for (int n : number){
            if (n > maxValue)
            maxValue = n;
        }
        return maxValue;
    }

     public static int min(int[] number){
        if (number == null || number.length == 0){
            throw new IllegalArgumentException();
        }
        int minValue = number[0];
        for (int n : number){
            if (n < minValue)
            minValue = n;
        }
        return minValue;
    }


    public static int placeholderInt(){ return 0; }
    public static double placeholderDouble(){ return 0.0; }
}