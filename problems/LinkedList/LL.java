
public class LL {

  private class Node {

    private Node next;
    private int value;

    // constructor
    public Node(int value) {
      this.value = value;
    }

    // constructor overloading
    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;

    if (tail == null) tail = head;
    size++;
  }

  public void insertLast (int value){
    Node node = new Node(value);
    if (tail == null) {
      insertFirst(value);
      return;
    }

    tail.next = node;
    tail = node;
    size++;
  }


  public void display(){
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END!");
  }

  public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // delete the duplicate value in the sorted-ll

    public void duplicate() {
      Node node = head;

      while (node != null) {
        if (node.value == node.next.value) {
          node.next = node.next.next;
          size--;
        }
        else node = node.next;
      }

      tail = node;
      tail.next = null;
    }

    public ListNode middleNode(ListNode head) {
      ListNode fast = head, slow = head;

      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

      }

      return slow;

    }

  public static void main(String[] args) {
    LL first = new LL();
    first.insertFirst(1);
    first.insertFirst(3);
    first.insertFirst(4);
    first.insertFirst(5);

    first.insertLast(10);

    first.display();

    first.insert(55, 3);

    first.display();
  }
}
