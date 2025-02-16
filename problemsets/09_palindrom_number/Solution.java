class Solution {
    // Given an integer x, return true if x is apalindrome, and false otherwise
    public boolean isPalindrome(int x) {
       if(x < 0) {
           return false;
       }

       String asString = String.valueOf(x);
       int endIndex = asString.length() - 1;
       for(int i = 0; i < asString.length(); i++) {
           if(asString.charAt(i) != asString.charAt(endIndex - i)) {
               return false;
           }
       }
       return true;
    }


    public static void main(String[] args) {
        int test=121;
        int test2=-121;
        int test3=10;
        Solution s = new Solution();

        System.out.println(s.isPalindrome(test));
        System.out.println(s.isPalindrome(test2));
        System.out.println(s.isPalindrome(test3));
    }
}
