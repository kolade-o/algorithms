import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem {
    public static void main(String[] args) {
        firstUniqChar();
    }
    public static int firstUniqChar() {
        String s = "leetcode";

        Map<Character, Integer> records = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            int count = records.containsKey(key) ? records.get(key) : 0;
            records.put(key, count+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (records.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
