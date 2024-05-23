public class Heapsort {

    public static void heapify(int i, int size, int arr[]) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int maxIdx = i;// parent

        // agar parent chota hai leftChild se tu parent ko bada kardo
        if (leftChild < size && arr[leftChild] > arr[maxIdx]) {
            maxIdx = leftChild;
        }

        // agar parent chota hai rightChild se tu parent ko bada kardo
        if (rightChild < size && arr[rightChild] > arr[maxIdx]) {
            maxIdx = rightChild;
        }

        // swaping between max and root kuki in maxHeap max hi root hota hai
        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(maxIdx, size, arr);
        }
    }

    public static void heapSort(int arr[]) {
        // step -1 build MAXHEAP
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(i, n, arr);
        }

        // step - 2 -PUSH THE LARGER ELEMENT TO LAST INDEX
        for (int i = n - 1; i > 0; i--) {
            // swap -- largest which is at 0th idx with smallest which is at last index(n-1)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, i, arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 1, 7, 8, 15, 69, 78 };
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}