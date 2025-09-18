// tehtava 2 Luvun merkki
public class LuvunMerkki {

    public static String sign(int n){
        if (n > 0){
            return "positiivinen";
        } else if (n < 0){
            return "negatiivinen";
        } else {
            return "nolla";
        }
    }

    public static void main(String[] args){
        String luvunMerkki = sign(-5);
        System.out.println("Luvun -5 merkki on: " + luvunMerkki);
    }
}
