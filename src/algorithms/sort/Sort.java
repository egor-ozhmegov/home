package algorithms.sort;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = {10, 23, 1, 8, 4, 2, 1};
        bubbleSort(array);
        selectionSort(array);
        insertionSort(array);
        mergeSort(array);
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    private static void bubbleSort(int[] array) {
        //TODO
    }

    private static void selectionSort(int[] array) {
        //TODO
    }

    private static void insertionSort(int[] array) {
        //TODO
    }

    private static void mergeSort(int[] array) {
        //TODO
    }

    private static void merge(int[] source, int[] leftArr, int[] rightArr) {
        //TODO
    }

    private static void quickSort(int[] array, int start, int end) {
        //TODO
    }

    private static void swap(int[] array, int indexRight, int indexLeft) {
        int temp = array[indexRight];
        array[indexRight] = array[indexLeft];
        array[indexLeft] = temp;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
