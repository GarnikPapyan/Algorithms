package Algorithms;

public class BubbleSort {
    static void bubbleSort(int [] arr) {
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,4,3,9,7,5};
        bubbleSort(arr);
        for(int x:arr) {
            System.out.println(x);
        }
    }
}
