import java.util.Arrays;

/**
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
* 
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
* 
* You can return the answer in any order.
* 
*  
* 
* Example 1:
* 
* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* 
* Example 2:
* 
* Input: nums = [3,2,4], target = 6
* Output: [1,2]
* 
* Example 3:
* 
* Input: nums = [3,3], target = 6
* Output: [0,1]
* 
*  
* 
* Constraints:
* 
*     2 <= nums.length <= 104
*     -109 <= nums[i] <= 109
*     -109 <= target <= 109
*     Only one valid answer exists.
* 
*  
* Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
public class TwoSums {


    public int[] two_sums(int[] given, int target) {
        for(int i = 0; i < given.length; i++) {
            if(Math.abs(given[i]) > Math.abs(target)) {
                continue;
            }
            for(int j = i+1; j < given.length; j++) {
                if(given[i] + given[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }

    public int[] two_sums_reverse(int[] num, int target) {
        for(int i = 0; i < num.length; i++) {
            int j = (num.length-1) - i;
            if(num[i] + num[j] == target) {
                return new int[] {i,j};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
      int[] test1 = new int[] {2,7,11,15};
      int target1 = 9;

      int[] test2 = new int[] {3,2,4};
      int target2 = 6;

      int[] test3 = new int[] {3,3};
      int target3 = 6;

      int[] test4 = new int[] {-1,-2,-3,-4,-5};
      int target4 = -8;

      // This isn't working yet
      int[] test5 = new int[] {-3,4,3,90};
      int target5 = 0;

      TwoSums sums = new TwoSums();
      System.out.println(Arrays.toString(sums.two_sums(test1, target1)));
      System.out.println(Arrays.toString(sums.two_sums(test2, target2)));
      System.out.println(Arrays.toString(sums.two_sums(test3, target3)));
      System.out.println(Arrays.toString(sums.two_sums(test4, target4)));


    }
}
