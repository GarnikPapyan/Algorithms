package Algorithms;

import java.util.Arrays;
//first
public class QuichSortFirst {
    public static void main(String[] args) {
        int [] arr = {3,2,4,1};
        System.out.println(Arrays.toString(arr));
        quichSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int partition(int [] arr,int first,int last) {
        int pivot = arr[first];
        int i = first+1;
        int j = last;
        while (i<=j) {
            while (i<=j && arr[i]<pivot) {
                i++;
            }
            while (i<=j && arr[j] >= pivot) {
                j--;
            }
            if(i<=j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[first];
        arr[first] = arr[j];
        arr[j] = tmp;
        return  j;
    }
    static void quichSort(int[] arr,int first, int last) {
        if(first < last) {
            int pivotIndex = partition(arr,first,last);
            quichSort(arr,first,pivotIndex-1);
            quichSort(arr,pivotIndex+1,last);
        }

    }
}
