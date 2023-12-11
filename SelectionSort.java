package Algorithms;

public class SelectionSort {

    static void seletionSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j = 1+i; j < arr.length; j++) {
                if(arr[j]<arr[index]) {
                     index = j;
                }
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,4,99,12,6,44,75,0};
        seletionSort(arr);
        for(int x : arr) {
            System.out.println(x);
        }
    }
}
