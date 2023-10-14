package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String x[]) {
        int array[] = {1, 0, 5, 3, 4, 10, 2, 1};
        System.out.println("Unsorted Array");
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
        System.out.println("/nSorted Array: ");
        selectionSort(array);
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
    }

    private static void selectionSort (int arr[]) {
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            int minIndex = i;
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //We have the minimum index here. We will swap.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
