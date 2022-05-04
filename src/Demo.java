import java.util.*;

public class Demo {
    private static Map<Character, Character> map = new HashMap<>();

    public static void main(String[] args) {
        populateMap();
        String s = "(){}";
        boolean boo = sone(s);

    }

    private static void populateMap() {
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }


    private static boolean sone(String s) {
        int len = s.length();

        Stack stack = new Stack();
        stack.size();

        Set<Character> keys = map.keySet();
        for(int i = 0; i<len; i++){
            char currChar = s.charAt(i);
            if(keys.contains(currChar)){
                if(stack.isEmpty()) return false;

                if(!map.get(currChar).equals(stack.peek())) return false;

                stack.pop();
            } else {
                stack.push(currChar);
            }
        }

        return stack.isEmpty();
    }
}
