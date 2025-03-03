import java.util.Stack;

public class Solution {

    /*
         The time complexity of the function is O(n),
         where n is the length of the input string s. This is because:
         The function iterates through each character in the string exactly once in the for loop.
         Each character is processed in constant time, either by pushing onto the stack or popping from it and performing a constant number of comparisons.
         Thus, the overall time complexity is linear, O(n).
    
         The space complexity of the function is also O(n) in the worst case. This is due to the usage of the stack prev, 
         which can store up to n/2 opening characters (in the case of a string with only opening brackets, e.g., "(((((" or "[{("). 
         Therefore, in the worst case, the stack may hold up to n/2 characters, but we generally express space complexity as O(n).
    */
    public boolean isValid(String s) {
        Stack<Character> prev = new Stack<>();
        for(int i =0 ; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(' || current == '[' || current == '{') {
                prev.push(current);
            } else {
                if(current == ')') {
                    if(prev.isEmpty() || prev.pop() != '(') {
                        return false;
                    }
                }
                if(current == ']') {
                    if(prev.isEmpty() || prev.pop() != '[') {
                        return false;
                    }
                }
                if(current == '}') {
                    if(prev.isEmpty() || prev.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return prev.isEmpty();
    }

    public static void main(String[] args) {
       Solution s = new Solution();
       System.out.println(s.isValid("()")); // true
       System.out.println(s.isValid("()[]{}")); // true
       System.out.println(s.isValid("(]")); // false
       System.out.println(s.isValid("([])")); // true
       System.out.println(s.isValid("({[()]})")); // true
       System.out.println(s.isValid("[")); // false
       System.out.println(s.isValid("([]")); // false
       System.out.println(s.isValid(")")); // false
       System.out.println(s.isValid("([{}])}")); // false
    }
}
