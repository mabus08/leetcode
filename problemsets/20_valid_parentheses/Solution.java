import java.util.Stack;

public class Solution {

    // Solution 1: Maybe not the best choice
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
