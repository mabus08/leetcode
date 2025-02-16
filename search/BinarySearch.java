/*
 * BinarySearch Algorithm 
 *  - Works only for ordered collections and arrays
 *  - Time Complexity: O(log(n))
 */
public class BinarySearch {

    public static void main (String args[]) {
        BinarySearch search = new BinarySearch();
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = search.searchIterative(array, 110);
        System.out.println("index: "+index);
    }

    public int searchIterative(int[] sortedArray, int key) {
        int index = Integer.MAX_VALUE;
        int low = 0;
        int high = sortedArray.length - 1;
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            if(sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }

        return index;
    }

    /*
     * Recursion may be slower due to overhead of maintaining a stack
     * - Not Stack Friendly: Can causes StackOverflow Exceptions
     * - Better approach for clarity
     */
    public int searchRecursive(int[] sortedArray, int key, int low, int high) {
        int middle = low  + ((high - low) / 2);
        if (high < low) {
            return -1;
        }
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return searchRecursive(
                    sortedArray, key, low, middle - 1);
        } else {
            return searchRecursive(
                    sortedArray, key, middle + 1, high);
        }
    }
}
