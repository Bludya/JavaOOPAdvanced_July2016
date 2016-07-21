package QuickSort;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 16, 45, 3, 36, 12, 23, 5, 5, 6, 12};
        quickSort(a, 0, a.length - 1);
        for (int n : a) {
            System.out.print(n + " ");
        }
    }

    private static void quickSort(int[] array, int min, int max) {
        int pivot = min;
        int storeIndex = min + 1;
        for (int i = storeIndex; i <= max; i++) {
            if (array[i] < array[pivot]) {
                swap(array, i, storeIndex);
                storeIndex++;
            }
        }

        swap(array, pivot, storeIndex - 1);

        if (storeIndex - min > 2) {
            quickSort(array, min, storeIndex - 2);
        }
        if (max - storeIndex > 2) {
            quickSort(array, storeIndex, max);
        }
    }


    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
