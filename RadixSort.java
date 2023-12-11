package Algorithms;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int [] arr = {329,457,657,839,720,355};
        System.out.println(Arrays.toString(arr));
        arr = radixSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
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
    static int[] countSort(int [] arr,int size,int exp) {
        int [] output = new int[size];
        int [] nums = new int[max(arr)];
        for (int i = 0; i < size; i++) {
            nums[arr[i]/exp%10]++;
        }
        for (int i = 1; i < max(arr) ; i++) {
            nums[i] += nums[i-1];
        }
        for (int i = size-1; i >=0 ; i--) {
            output[nums[arr[i]/exp%10]-1] = arr[i];
            nums[arr[i]/exp%10]--;
        }
        return output;
    }
    static int[] radixSort(int[] arr, int size) {
        int max = max(arr);
        for (int exp = 1; max/exp > 0 ; exp*=10) {
            arr = countSort(arr,size,exp);
        }
        return  arr;
    }

}
