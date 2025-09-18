//tehtava 9 salasanayritykset

public class Salasanayritykset {

    public static String login(String[] attempts) {
        String correct = "java123";

        // go through at most 3 attempts
        for (int i = 0; i < attempts.length && i < 3; i++) {
            if (correct.equals(attempts[i])) {
                return "Tervetuloa!";
            }
        }

        return "Liian monta yritystä.";
    }

    public static void main(String[] args) {
        System.out.println(login(new String[] {"no","java123","x"}));  

        System.out.println(login(new String[] {"a","b"}));  

        System.out.println(login(new String[] {"no","no","no","java123"}));  
    }
}
