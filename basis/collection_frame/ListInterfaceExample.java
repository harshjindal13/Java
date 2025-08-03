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

  static void ArraysFunc(Scanner in){


    ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
        listOfLists.add(new ArrayList<>());
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            listOfLists.get(i).add(in.nextInt());
        }
    }
    System.out.println(listOfLists);
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

    try (Scanner in = new Scanner(System.in)) {
      ArraysFunc(in);
    }
    

    // System.out.println("\n Array list start: \n\n");

    // ArrayListExample();
    // System.out.println("\n Linked list start: \n\n");
    // LinkedListExample();
    // System.out.println("\n Stack start: \n\n");
    // StackExamples();
  }
}
