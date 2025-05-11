package basis.collection_frame;
import java.util.*;

public class QueueInterfaceExample {
  static void QueueExample(){
    LinkedList<Integer> q = new LinkedList<>();
    q.offer(1);
    q.offer(2);
    q.offer(3);
    System.out.println(q.peek()); // 1
    System.out.println(q.poll()); // 1 display and remove
    System.out.println(q.peek()); // 2
    System.out.println(q.isEmpty()); // f
    System.out.println(q.size()); // 2
    System.out.println(q);
  }

  static void PriorityQueueExamples(){
    // PriorityQueue<Integer> pq = new PriorityQueue<>(); // min PQ
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    pq.add(10);
    pq.add(5);
    pq.add(7);

    System.out.println(pq.peek()); // 5 - By default smallest ele has ⇡ priority
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);
    System.out.println(pq.peek());
    pq.add(4);
    System.out.println(pq);

  }

  static void DequeExample(){
    Deque<Integer> dq = new ArrayDeque<>();
    dq.addFirst(1);
    dq.addFirst(2);
    dq.addLast(3);
    dq.addLast(4);

    // [2, 1, 3, 4]

    System.out.println(dq);
    System.out.println(dq.peekFirst());
    System.out.println(dq.peekLast());
    System.out.println(dq.pollFirst());
    System.out.println(dq.pollLast());
    System.out.println(dq);  // [1, 3]

  }

  public static void main(String[] args) {
    DequeExample();
  }
  
}
