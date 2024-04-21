public class QucikSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        /* PIVIOT AS MY LAST ELEMENT */
        int pivotidx = partition(arr, si, ei);
        /* LEFT PART */
        quickSort(arr, si, pivotidx - 1);
        /* RIGHT PART */
        quickSort(arr, pivotidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        /* PIVOT SELECTION */
        int pivot = arr[ei];
        /* TO MAKE PLACE FOR ELEMENTS LESS THAN PIVOT */
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                /* SWAP */
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        /* SWAP */
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
