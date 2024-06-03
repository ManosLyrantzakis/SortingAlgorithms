import java.util.Random;

public class SortingAlgorithms {
    public static void printVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void initializeVector(int vector[]) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(101); // Generates random integers from 0 to 100
        }
    }

    public static int[] replicate(int vector[]) {
        int[] replica = new int[vector.length];
        System.arraycopy(vector, 0, replica, 0, vector.length);
        return replica;
    }

    public static void mergeSort(int vector[], int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(vector, 0, left, 0, mid);
        System.arraycopy(vector, mid, right, 0, n - mid);

        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(vector, left, right, mid, n - mid);
    }

    private static void merge(int[] vector, int[] left, int[] right, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                vector[k++] = left[i++];
            } else {
                vector[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            vector[k++] = left[i++];
        }

        while (j < rightLength) {
            vector[k++] = right[j++];
        }
    }

    public static void quickSort(int vector[], int first, int last) {
        if (first < last) {
            int pivotIndex = partition(vector, first, last);
            quickSort(vector, first, pivotIndex - 1);
            quickSort(vector, pivotIndex + 1, last);
        }
    }

    private static int partition(int vector[], int first, int last) {
        int pivot = vector[last];
        int i = first - 1;

        for (int j = first; j < last; j++) {
            if (vector[j] < pivot) {
                i++;
                int temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
            }
        }

        int temp = vector[i + 1];
        vector[i + 1] = vector[last];
        vector[last] = temp;

        return i + 1;
    }
}
