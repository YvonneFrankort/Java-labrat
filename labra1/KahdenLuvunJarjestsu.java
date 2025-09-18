// tehtava 4 kahden luvun jarjestys

class KahdenLuvunJarjestys{

    public static String order2(int a, int b ){
        if (a < b) {
            return a + "," + b;
        }else{
            return b + "," + a;
        }

    }

    public static void main(String[] args){
        System.out.println(order2(5 ,2));
        System.out.println(order2(3 ,3));

    }
}