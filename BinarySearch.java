package Algorithms;

public class BinarySearch {
    public static int runBinarySearchIteratively(int[] sortedArray, int key ) {
        int low = 0;
        int high = sortedArray.length-1;
        int index = 0;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
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
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,9,10,11};
        int key  = 4;
        System.out.println(runBinarySearchIteratively(arr,key));
    }
}
