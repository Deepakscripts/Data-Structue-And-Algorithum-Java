//for min heap
import java.util.*;

public class HeapImp {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last idx
            arr.add(data);

            int x = arr.size() - 1;// x = child index
            int parIdx = (x - 1) / 2;// parent idx

            // kya parent bada hai; kuki min hepa mai parent chot hota hai
            while (arr.get(parIdx) > arr.get(x)) {// log(n)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parIdx));
                arr.set(parIdx, temp);

                // updatation
                x = parIdx;
                parIdx = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int leftChildIdx = 2 * i + 1;
            int righyChildIdx = 2 * i + 2;
            // min idx will store min ka index for later swaping
            int minIdx = i;//parent
            if (leftChildIdx < arr.size() && arr.get(minIdx) > arr.get(leftChildIdx)) {
                // 2nd condition agar parent bada hai leftChild se tu
                minIdx = leftChildIdx;

            }
            if (righyChildIdx < arr.size() && arr.get(minIdx) > arr.get(righyChildIdx)) {
                // 2nd condition agar parent bada hai rightChild se tu
                minIdx = righyChildIdx;
            }

            // swaping between min and root kuki in minHeap min hi root hota hai
            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // recursive call
                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);
            // STEP-1 swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // STEP - 2 DELETE LAST
            arr.remove(arr.size() - 1);

            // STEP - 3 HEAPIFY
            heapify(0);
            return data;
        }

        // isEmpty
        public boolean isEmpty() {
            if (arr.size() == 0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(11);
        h.add(24);
        h.add(36);
        h.add(48);
        h.add(57);

        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
