package Algorithms;

public class MergeSort {
    static void merge(int left, int right,int[] arr,int[] l, int [] r) {
        int i = 0,j=0,k=0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }

    }
    static void mergesort(int size,int[] arr) {
        if(size < 2) {
            return;
        }
        int mid = size/2;
        int[] arrLeft = new int[mid];
        int[] arrRight = new int[size-mid];

        for (int i = 0; i < mid; i++) {
            arrLeft[i] = arr[i];
        }
        for (int i = mid; i < size; i++) {
            arrRight[i-mid] = arr[i];
        }

        mergesort(mid,arrLeft);
        mergesort(size-mid,arrRight);
        merge(mid,size-mid,arr,arrLeft,arrRight);

    }

    public static void main(String[] args) {
        int [] arr = {2,3,8,9,6,1,7,5,4};

        mergesort(arr.length,arr);

        for (int x:arr) {System.out.println(x);}
    }


}
