package Algorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int [] arr = {2,5,3,0,2,3,0,3};
        System.out.println(Arrays.toString(arr));
        arr=countingSort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int [] countingSort(int[] arr,int size) {
        int[] output = new int[size + 1];
        int [] nums = new int[max(arr)+1];   //kam max-min+1
        for (int i = 0; i < arr.length;i++) {
            nums[arr[i]]++;
        }
        for (int i = 1; i <= nums.length-1; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = size; i >=0 ; i--) {
            output[nums[arr[i]]-1] = arr[i];
            --nums[arr[i]];
        }

        return output;
    }
    static int max(int []arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
