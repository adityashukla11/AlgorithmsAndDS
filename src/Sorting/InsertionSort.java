package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String x[]) {
        int array[] = {1, 0, 5, 3, 4, 10, 2, 1};
        System.out.println("Unsorted Array");
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
        System.out.println();
        System.out.println("Sorted Array: ");
        insertionSort(array);
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
    }

    private static void insertionSort(int arr[]){
        for (int i = 1 ; i < arr.length ; i++) {
            int key = arr[i]; //This element has to be replaced from it's position.
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                //We keep shifting to right.
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; //Insert the key at right place
        }
    }
}
