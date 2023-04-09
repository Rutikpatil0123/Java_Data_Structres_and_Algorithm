package HashMapCode;

import Oops.access.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {

    static class HashMap<K,V>{

        private class Node{

            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;

            }
        }

        private int n;
        private int N;

        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){

            int bucketIndex = key.hashCode();
            // Since N is the size of array, so we want bucketIndex in between 0 to N-1
            return Math.abs(bucketIndex) % N;
        }

        private int searchInLL(K key, int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];

            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldLinkedList[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0; i < N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldLinkedList.length; i++){
                LinkedList<Node> ll = oldLinkedList[i];

                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){

            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex == -1){
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }else{
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }

            double lambda = (double) n/N;

            if(lambda > 2.0){
                //Rehashing
                rehash();
            }

        }

        public V get(K key){
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex == -1){
                return null;
            }else {
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
        }

        public boolean containsKey(K key){

            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex == -1){
                return false;
            }else{
                return true;
            }
        }

        public V remove(K key){

            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex == -1){
                return  null;
            }else{

                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int bucketIndex = 0; bucketIndex < buckets.length; bucketIndex++){
                LinkedList<Node> ll = buckets[bucketIndex];

                for(int dataIndex = 0; dataIndex < ll.size(); dataIndex++){
                    Node node = ll.get(dataIndex);
                    keys.add(node.key);
                }
            }

            return keys;
        }


    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Microsoft", 45);
        map.put("Amazon", 45);
        map.put("Paytm", 18);
        map.put("Dell", 12);
        map.put("Dell", 8);

        ArrayList<String> keys = map.keySet();
        for(int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i) + " " + map
                    .get(keys.get(i)));
        }
    }

}
