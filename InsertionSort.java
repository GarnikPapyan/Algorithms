package Algorithms;

public class InsertionSort {

    public static void main(String[] args) {
        int [] arr = {12,11,13,5,6};

        InsertSort(arr);
    }

    static void InsertSort(int [] arr) {

        for (int i = 1; i < arr.length; ++i) {
            int tmp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>tmp ) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = tmp;
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}


