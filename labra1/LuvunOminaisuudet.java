// tehtava 3 Luvun ominaisuudet
public class LuvunOminaisuudet {

    public static String signAndParity(int n){
        if (n > 0 && n%2 == 0){
            return "positiivinen parillinen";
        } else if (n < 0 && n%2 == 0){
            return "negatiivinen parillinen";
        } else if (n > 0 && n%2 != 0){
            return "positiivinen pariton";
        }else if (n < 0 && n%2 != 0){
            return "negatiivinen pariton";
        }else{
            return "nolla";
        }
    }

    public static void main(String[] args){
        int number = -5;
        System.out.println("Luku " + number + " on " + signAndParity(number));
    }
}