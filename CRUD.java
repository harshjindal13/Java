import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CRUD {

    public static void main(String[] args) throws Exception {
        // Array CRUD
        System.out.println("--- Array CRUD ---");
        ArrayCRUD.run();
        System.out.println();

        // LinkedList CRUD
        System.out.println("--- LinkedList CRUD ---");
        LinkedListCRUD.run();
        System.out.println();

        // Stack CRUD
        System.out.println("--- Stack CRUD ---");
        StackCRUD.run();
        System.out.println();

        // Queue CRUD
        System.out.println("--- Queue CRUD ---");
        QueueCRUD.run();
        System.out.println();

        // Tree CRUD (BST)
        System.out.println("--- Tree CRUD (BST) ---");
        TreeCRUD.run();
        System.out.println();

        // Heap CRUD
        System.out.println("--- Heap CRUD ---");
        HeapCRUD.run();
        System.out.println();

        // HashMap CRUD
        System.out.println("--- HashMap CRUD ---");
        HashMapCRUD.run();
        System.out.println();
    }

    // Array CRUD Operations
    static class ArrayCRUD {
        public static void run() {
            System.out.println("--- CRUD operations on a fixed-size Array ---");

            // CREATE
            int[] array = new int[5];
            array[0] = 10;
            array[1] = 20;
            array[2] = 30;
            array[3] = 40;
            array[4] = 50;
            System.out.println("Created array: " + Arrays.toString(array));

            // READ
            System.out.println("Element at index 2: " + array[2]);

            // UPDATE
            array[2] = 35;
            System.out.println("Updated array: " + Arrays.toString(array));

            // DELETE (by creating a new array)
            int indexToDelete = 1;
            int[] newArray = new int[array.length - 1];
            for (int i = 0, k = 0; i < array.length; i++) {
                if (i == indexToDelete) {
                    continue;
                }
                newArray[k++] = array[i];
            }
            array = newArray;
            System.out.println("Array after deleting element at index 1: " + Arrays.toString(array));

            System.out.println("\n--- CRUD operations on an ArrayList (Dynamic Array) ---");

            // CREATE
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Cherry");
            System.out.println("Created ArrayList: " + arrayList);

            // READ
            System.out.println("Element at index 1: " + arrayList.get(1));

            // UPDATE
            arrayList.set(1, "Blueberry");
            System.out.println("Updated ArrayList: " + arrayList);

            // DELETE
            arrayList.remove(0);
            System.out.println("ArrayList after deleting element at index 0: " + arrayList);
        }
    }

    // LinkedList CRUD Operations
    static class LinkedListCRUD {
        // Singly-Linked List
        static class LL {
            private Node head;
            private int size;

            public void insertFirst(int val) {
                Node node = new Node(val);
                node.next = head;
                head = node;
                size++;
            }

            public void insertLast(int val) {
                if (head == null) {
                    insertFirst(val);
                    return;
                }
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(val);
                size++;
            }

            public int deleteFirst() {
                int val = head.value;
                head = head.next;
                size--;
                return val;
            }

            public int deleteLast() {
                if (size <= 1) {
                    return deleteFirst();
                }
                Node secondLast = get(size - 2);
                int val = secondLast.next.value;
                secondLast.next = null;
                size--;
                return val;
            }
            
            public Node get(int index) {
                Node node = head;
                for (int i = 0; i < index; i++) {
                    node = node.next;
                }
                return node;
            }

            public void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.value + " -> ");
                    temp = temp.next;
                }
                System.out.println("END");
            }

            private class Node {
                private int value;
                private Node next;

                public Node(int value) {
                    this.value = value;
                }
            }
        }

        public static void run() {
            LL list = new LL();
            // CREATE
            list.insertFirst(3);
            list.insertFirst(2);
            list.insertLast(99);
            System.out.print("Created List: ");
            list.display();

            // READ
            System.out.println("Node at index 1: " + list.get(1).value);

            // UPDATE (is complex, usually re-creation of nodes)

            // DELETE
            list.deleteFirst();
            System.out.print("After deleting first: ");
            list.display();
            list.deleteLast();
            System.out.print("After deleting last: ");
            list.display();
        }
    }

    // Stack CRUD Operations
    static class StackCRUD {
        static class CustomStack {
            protected int[] data;
            private static final int DEFAULT_SIZE = 10;
            int ptr = -1;

            public CustomStack(int size) {
                this.data = new int[size];
            }

            public boolean push(int item) { // CREATE
                if (isFull()) {
                    System.out.println("Stack is full!!");
                    return false;
                }
                ptr++;
                data[ptr] = item;
                return true;
            }

            public int pop() throws Exception { // DELETE
                if (isEmpty()) {
                    throw new Exception("Cannot pop from an empty stack!!");
                }
                return data[ptr--];
            }

            public int peek() throws Exception { // READ
                if (isEmpty()) {
                    throw new Exception("Cannot peek from an empty stack!!");
                }
                return data[ptr];
            }

            public boolean isFull() {
                return ptr == data.length - 1;
            }

            public boolean isEmpty() {
                return ptr == -1;
            }
        }

        public static void run() throws Exception {
            CustomStack stack = new CustomStack(5);
            // CREATE (Push)
            stack.push(10);
            stack.push(20);
            System.out.println("Pushed 10, 20");
            // READ (Peek)
            System.out.println("Top element: " + stack.peek());
            // DELETE (Pop)
            System.out.println("Popped element: " + stack.pop());
        }
    }

    // Queue CRUD Operations
    static class QueueCRUD {
        static class CustomQueue {
            private int[] data;
            private static final int DEFAULT_SIZE = 10;
            int end = 0;

            public CustomQueue(int size) {
                this.data = new int[size];
            }

            public boolean insert(int item) { // CREATE
                if (isFull()) {
                    return false;
                }
                data[end++] = item;
                return true;
            }

            public int remove() throws Exception { // DELETE
                if (isEmpty()) {
                    throw new Exception("Queue is empty");
                }
                int removed = data[0];
                for (int i = 1; i < end; i++) {
                    data[i - 1] = data[i];
                }
                end--;
                return removed;
            }

            public int front() throws Exception { // READ
                if (isEmpty()) {
                    throw new Exception("Queue is empty");
                }
                return data[0];
            }

            public boolean isFull() {
                return end == data.length;
            }

            public boolean isEmpty() {
                return end == 0;
            }
        }

        public static void run() throws Exception {
            CustomQueue queue = new CustomQueue(5);
            // CREATE (Insert)
            queue.insert(100);
            queue.insert(200);
            System.out.println("Inserted 100, 200");
            // READ (Front)
            System.out.println("Front element: " + queue.front());
            // DELETE (Remove)
            System.out.println("Removed element: " + queue.remove());
        }
    }

    // Tree (BST) CRUD Operations
    static class TreeCRUD {
        static class BST {
            public class Node {
                private int value;
                private Node left, right;

                public Node(int value) {
                    this.value = value;
                }
            }

            private Node root;

            public void insert(int value) { // CREATE
                root = insert(value, root);
            }

            private Node insert(int value, Node node) {
                if (node == null) {
                    return new Node(value);
                }
                if (value < node.value) {
                    node.left = insert(value, node.left);
                } else if (value > node.value) {
                    node.right = insert(value, node.right);
                }
                return node;
            }

            public boolean find(int value) { // READ
                return find(root, value);
            }

            private boolean find(Node node, int value) {
                if (node == null) return false;
                if (node.value == value) return true;
                return value < node.value ? find(node.left, value) : find(node.right, value);
            }

            public void delete(int value) { // DELETE
                root = delete(root, value);
            }

            private Node delete(Node node, int value) {
                if (node == null) return null;
                if (value < node.value) {
                    node.left = delete(node.left, value);
                } else if (value > node.value) {
                    node.right = delete(node.right, value);
                } else {
                    if (node.left == null) return node.right;
                    else if (node.right == null) return node.left;
                    node.value = minValue(node.right);
                    node.right = delete(node.right, node.value);
                }
                return node;
            }

            private int minValue(Node node) {
                int minv = node.value;
                while (node.left != null) {
                    minv = node.left.value;
                    node = node.left;
                }
                return minv;
            }
             public void display() {
                display(this.root, "Root Node: ");
            }

            private void display(Node node, String details) {
                if (node == null) {
                    return;
                }
                System.out.println(details + node.value);
                display(node.left, "Left child of " + node.value + " : ");
                display(node.right, "Right child of " + node.value + " : ");
            }
        }

        public static void run() {
            BST tree = new BST();
            // CREATE
            tree.insert(50);
            tree.insert(30);
            tree.insert(70);
            System.out.println("Inserted 50, 30, 70");
            tree.display();
            // READ
            System.out.println("Find 30: " + tree.find(30));
            // DELETE
            tree.delete(30);
            System.out.println("Deleted 30");
            tree.display();
        }
    }

    // Heap CRUD Operations
    static class HeapCRUD {
        static class Heap<T extends Comparable<T>> {
            private ArrayList<T> list = new ArrayList<>();

            public void insert(T value) { // CREATE
                list.add(value);
                upheap(list.size() - 1);
            }

            public T remove() throws Exception { // DELETE
                if (list.isEmpty()) {
                    throw new Exception("Heap is empty");
                }
                T temp = list.get(0);
                T last = list.remove(list.size() - 1);
                if (!list.isEmpty()) {
                    list.set(0, last);
                    downheap(0);
                }
                return temp;
            }
            
            public T peek() throws Exception { // READ
                if (list.isEmpty()) {
                    throw new Exception("Heap is empty");
                }
                return list.get(0);
            }

            private void upheap(int index) {
                if (index == 0) return;
                int p = (index - 1) / 2;
                if (list.get(index).compareTo(list.get(p)) < 0) {
                    swap(index, p);
                    upheap(p);
                }
            }

            private void downheap(int index) {
                int min = index;
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) min = left;
                if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) min = right;
                if (min != index) {
                    swap(min, index);
                    downheap(min);
                }
            }

            private void swap(int i, int j) {
                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        public static void run() throws Exception {
            Heap<Integer> heap = new Heap<>();
            // CREATE
            heap.insert(30);
            heap.insert(20);
            heap.insert(10);
            System.out.println("Inserted 30, 20, 10");
            // READ
            System.out.println("Min element (peek): " + heap.peek());
            // DELETE
            System.out.println("Removed min element: " + heap.remove());
        }
    }

    // HashMap CRUD Operations
    static class HashMapCRUD {
        static class CustomHashMap<K, V> {
            private ArrayList<LinkedList<Entity>> list;
            private int size = 0;
            private float lf = 0.5f;

            public CustomHashMap() {
                list = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    list.add(new LinkedList<>());
                }
            }

            public void put(K key, V value) { // CREATE / UPDATE
                int hash = Math.abs(key.hashCode() % list.size());
                LinkedList<Entity> entities = list.get(hash);
                for (Entity entity : entities) {
                    if (entity.key.equals(key)) {
                        entity.value = value;
                        return;
                    }
                }
                if ((float) (size) / list.size() > lf) reHash();
                entities.add(new Entity(key, value));
                size++;
            }

            public V get(K key) { // READ
                int hash = Math.abs(key.hashCode() % list.size());
                LinkedList<Entity> entities = list.get(hash);
                for (Entity entity : entities) {
                    if (entity.key.equals(key)) return entity.value;
                }
                return null;
            }

            public void remove(K key) { // DELETE
                int hash = Math.abs(key.hashCode() % list.size());
                LinkedList<Entity> entities = list.get(hash);
                Entity target = null;
                for (Entity entity : entities) {
                    if (entity.key.equals(key)) {
                        target = entity;
                        break;
                    }
                }
                entities.remove(target);
                size--;
            }

            private void reHash() {
                ArrayList<LinkedList<Entity>> old = list;
                list = new ArrayList<>();
                size = 0;
                for (int i = 0; i < old.size() * 2; i++) {
                    list.add(new LinkedList<>());
                }
                for (LinkedList<Entity> entries : old) {
                    for (Entity entry : entries) {
                        put(entry.key, entry.value);
                    }
                }
            }

            private class Entity {
                K key;
                V value;

                public Entity(K key, V value) {
                    this.key = key;
                    this.value = value;
                }
            }
        }

        public static void run() {
            CustomHashMap<String, Integer> map = new CustomHashMap<>();
            // CREATE
            map.put("A", 1);
            map.put("B", 2);
            System.out.println("Put ('A', 1), ('B', 2)");
            // READ
            System.out.println("Get 'A': " + map.get("A"));
            // UPDATE
            map.put("A", 10);
            System.out.println("Updated 'A' to 10. Get 'A': " + map.get("A"));
            // DELETE
            map.remove("B");
            System.out.println("Removed 'B'. Get 'B': " + map.get("B"));
        }
    }
}
