/*
 * Insertion sort
 * We start with an empty left hand and the cards laid down on the table. 
 * We then remove one card at a time from the table and insert it into the correct position in the left hand.
 * To find the correct position for a new card, we compare it with the already sorted set of cards in the hand,
 * from right to left.
 * - efficient for odering a _small_ number of items
 * - time complexity is O(n^2)
 * - space complexity is O(1) iterative and O(n) recursive
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class Insertionsort {

    public static void main(String[] args) {
        Insertionsort s = new Insertionsort();

        Integer[] a = {10, 100, 4, 2, 1000, 99, 78, 29, 0, -10};
        System.out.println(Arrays.stream(a)
              .map(String::valueOf)
              .collect(Collectors.joining(" ")));
        s.sortIterative(a);

        System.out.println(Arrays.stream(a)
              .map(String::valueOf)
              .collect(Collectors.joining(" ")));
    }

   public void sortIterative(Integer[] array) {
       for(int i = 0; i < array.length; i++) {
           int key = array[i];
           int j = i - 1;
           while(j >= 0 && array[j] > key) {
               array[j+1] = array[j];
               j = j - 1;
           }
           array[j+1] = key;
       }
   }

   public void sortRecursive(int[] array, int i) {
       if(i <= 1) {
           return;
       }
       sortRecursive(array, i-1);
       int key = array[i-1];
       int j = i -2;
       while(j >= 0 && array[j] > key) {
           array[j + 1] = array[j];
           j = j - 1;
       }
       array[j+1] = key;
   }
}
