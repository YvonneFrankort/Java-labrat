import java.util.Map;
import java.util.HashMap;

public class Frequency {
    public Map<Character, Integer> frequencies(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toLowerCase().toCharArray()) { //turns Strig into Array List
            if (Character.isLetter(c)) { // skips spaces, commas, punctuation
                if (freq.containsKey(c)) {
                    freq.put(c, freq.get(c) + 1);
                } else {
                    freq.put(c, 1);
                }
            }
        }

        return freq;
    }
}

// https://moodle.oulu.fi/pluginfile.php/3202031/mod_resource/content/2/java-viisi-harjoitusta.html