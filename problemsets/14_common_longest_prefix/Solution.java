/*
     📍 Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".

      👉 Constraints:

        * 1 <= strs.length <= 200
        * 0 <= strs[i].length <= 200
        * strs[i] consists of only lowercase English letters if it is non-empty.
*/
class Solution {
    /*
     * Space Complexity: O(1)
     * Time Complexity: O(n*m)
     */
    public String longestCommonPrefix(String[] strs) {
            String result = strs[0];
            for(int i = 1; i < strs.length; i++) {
               for(int y = 0; y < result.length(); y++) {
                   String next = strs[i];
                   if(y >= next.length() || result.charAt(y) != next.charAt(y)) {
                       result = result.substring(0, y);
                       break;
                   }
               }
            }
            return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
        System.out.println(s.longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
    }
}
