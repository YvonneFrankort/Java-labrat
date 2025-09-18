// tehtava 1 Parillisuus
public class Parillisuus {

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    // test for the metodi
    public static void main(String[] args){
        boolean kahdeksanOnParillinen = isEven (8);
        System.out.println("Onko 8 parillinen? " + kahdeksanOnParillinen);
    }
}
