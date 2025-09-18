//tehtava 8 salasanan takistus

class SalasananTarkistus {

    public static boolean check(String s) {
        if (s == null) {  //if empty return flase
            return false;
        }
        return s.equals("java123"); //if not, check the password
    }

    public static void main(String[] args) {
        System.out.println(check("java123"));  
        System.out.println(check(null)); 
    }
}
