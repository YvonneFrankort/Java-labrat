// tehtava 7 kertotaulu 1...10

class KertotauluKymmenen{
    public static String kerto(int n, int i){
        return n + "x" + i + "=" + (n*i) + "\n";
    }

    public static void main(String[] args){
        int n = 10;
        for (int i = 0; i <= 10; i ++){
            System.out.println(kerto(n, i));
        }
    }
}