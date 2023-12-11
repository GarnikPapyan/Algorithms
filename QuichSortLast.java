package Algorithms;

import java.util.Arrays;

//last
public class QuichSortLast {
    public static void main(String[] args) {
        int [] arr = {1,3,6,79,3,7,0,325,35,33,12};
        System.out.println(Arrays.toString(arr));
        quichSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int partition(int [] arr,int first,int last) {
        int pivot = arr[last];
        int i = first -1;
        int j = first;
        while (j < last) {
            if(arr[j]<=pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            j++;
        }
        int tmp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = tmp;
        return  i+1;
    }
    static void quichSort(int[] arr,int first, int last) {
        if(first < last) {
            int pivotIndex = partition(arr,first,last);
            quichSort(arr,first,pivotIndex-1);
            quichSort(arr,pivotIndex+1,last);
        }

    }
}
