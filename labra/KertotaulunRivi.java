// tehtava 6 kertotaulun rivi

class KertotaulunRivi{

    public static String kerto(int n, int i){
        return n + "x" + i + "=" + (n*i) + "\n";
    }

    public static void main(String[] args){
        System.out.println(kerto(5 , 1));
    }


}