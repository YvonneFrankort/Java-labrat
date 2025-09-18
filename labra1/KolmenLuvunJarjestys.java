// tehtava 5 Kolmen luvun jarjestys

public class KolmenLuvunJarjestys {

    public static String order3(int a, int b, int c) {
        if (a > b) { 
            int temp = a;
            a = b; 
            b = temp; 
        }
        if (a > c) { 
            int temp = a; 
            a = c; 
            c = temp; 
        }
        if (b > c) { 
            int temp = b; 
            b = c; 
            c = temp; 
        }
        return a + "," + b + "," + c;
    }

    public static void main(String[] args) {
        System.out.println(order3(5, 2, 9)); 
        System.out.println(order3(3, 7, 3)); 
        System.out.println(order3(3, 2, 1)); 
    }
}
