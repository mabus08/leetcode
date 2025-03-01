import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Character, Integer> mapping = new HashMap<>();
    
    Solution() {
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);
    }

    /**
      📣 Constraints:
         - 1 <= s.length <= 15
         - s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
         - It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     */
    public int romanToInt(String s) {
        int sum= 0;
        int current = mapping.get(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
           int next = mapping.get(s.charAt(i));
           if(current < next) {
               sum -= current;
           } else {
               sum += current;
           }
           current = next;
        }

        sum += current;
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("III"));
        System.out.println(s.romanToInt("LVIII"));
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}
