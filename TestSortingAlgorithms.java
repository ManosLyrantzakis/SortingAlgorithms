public class TestSortingAlgorithms {
    public static void main(String args[]) {
        int vector1[] = new int[8];
        int replica1[] = new int[8];
        int vector2[] = new int[16];
        int replica2[] = new int[16];
        int vector3[] = new int[32];
        int replica3[] = new int[32];

        SortingAlgorithms.initializeVector(vector1);
        SortingAlgorithms.initializeVector(vector2);
        SortingAlgorithms.initializeVector(vector3);

        replica1 = SortingAlgorithms.replicate(vector1);
        replica2 = SortingAlgorithms.replicate(vector2);
        replica3 = SortingAlgorithms.replicate(vector3);

        System.out.println("\n*************************************************");
        System.out.println("\n------------------ TESTING 2 Sorting Algorithms ------------------");

        System.out.println("\nΤο τυχαίο μη ταξινομημένο διάνυσμα vector1 αρχικά είναι: \n");
        SortingAlgorithms.printVector(vector1);
        System.out.println("\n*************************************************");
        System.out.println("\n------------------ TESTING 2 Sorting Algorithms ------------------");

        System.out.println("\nΤο τυχαίο μη ταξινομημένο διάνυσμα vector1 αρχικά είναι:");
        SortingAlgorithms.printVector(vector1);
        SortingAlgorithms.mergeSort(vector1, vector1.length);
        SortingAlgorithms.quickSort(replica1, 0, replica1.length - 1);

        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο MergeSort, προκύπτει το νέο διάνυσμα vector1:");
        SortingAlgorithms.printVector(vector1);

        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο QuickSort, προκύπτει το νέο διάνυσμα replica1:");
        SortingAlgorithms.printVector(replica1);

        

    }
}  
