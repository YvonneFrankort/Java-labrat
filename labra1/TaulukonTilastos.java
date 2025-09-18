//tehtava 10 Taulukon tilastot

class TaulukonTilastost{
    public static double average(int[] a){
        if (a == null && a.length == 0){ //if empty, return 0
            return 0.0;
        }
        double sum = 0;
        for (int b : a) {
            sum += b;
        }
        return sum / a.length;

    }

    public static int max(int[] a){
        if (a== null && a.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int b : a) {
            max= b;
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(average(new int[] {5, 10, 15}));    
        System.out.println(max(new int[] {-1, 20, 3, 7}));    
        System.out.println(average(new int[] {}));            
        System.out.println(max(new int[] {}));                
    }

}