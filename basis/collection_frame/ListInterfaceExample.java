package basis.collection_frame;
import java.util.*;

public class ListInterfaceExample {

  // LIST INTERFACE

  static void ArrayListExample(){

    ArrayList<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    System.out.println(l);
    System.out.println(l.get(1));
    l.set(1, 10);
    System.out.println(l);
    System.out.println(l.contains(10));

  }

  static void LinkedListExample(){

    LinkedList<Integer> l = new LinkedList<>();
    l.add(1);
    l.add(2);
    l.add(3);

    System.out.println(l);
    l.set(1, 5);
    System.out.println(l);
  }

  static void StackExamples(){
    Stack<String> st = new Stack<>();
    st.push("HI");
    st.push("Harsh");

    System.out.println(st.peek());
    System.out.println(st.pop());
    System.out.println(st.size());
    System.out.println(st.empty());
    System.out.println(st);
    
    st.push(" hello!");
    
    System.out.println(st);
  }



  public static void main(String[] args) {
    StackExamples();
  }
}
