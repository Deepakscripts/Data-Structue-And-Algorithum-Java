import java.util.*;

public class HashMapIMP {

    static class HashMap<K, V> {// generic

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;// n -> Total no of Nodes
        private int N;// size of array
        private LinkedList<Node> buckets[];// N -> ARRAY of Linkedlist

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFnx(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes ko add karan ahai new bucket ke ander
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {

            // STEP-1
            int bi = hashFnx(key);
            // STEP-2
            int di = searchInLL(key, bi);
            // update karo existing value of node of LL
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
                // add new node if not exist alredy
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }

        }

        // contains key
        public boolean containsKey(K key) {

            // STEP-1
            int bi = hashFnx(key);
            // STEP-2
            int di = searchInLL(key, bi);

            if (di != -1) {
                return true;

            } else {
                return false;
            }
        }

        // get
        public V get(K key) {
            // STEP-1
            int bi = hashFnx(key);
            // STEP-2
            int di = searchInLL(key, bi);
            // update karo existing value of node of LL
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
                // add new node if not exist alredy
            } else {
                return null;
            }
        }

        // remove
        public V remove(K key) {
            // STEP-1
            int bi = hashFnx(key);
            // STEP-2
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;

            } else {
                return null;
            }
        }

        // keySet
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // isEmpty
        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("INDIA", 50000);
        hm.put("PAK", 5600);
        hm.put("NEPAL", 800);
        hm.put("SRI-LANKA", 8800);
        hm.put("BHUTAN", 5900);

        AbstractList<String> keys = hm.keySet();

        for (String key : keys) {
           System.out.println(key); 
        }
    }
}
