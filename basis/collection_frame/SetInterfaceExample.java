package basis.collection_frame;
import java.util.*;


public class SetInterfaceExample {

  static void HashSetExample(){ // UNORDERED, UNIQUE, HASHING INTERNALLY
    HashSet<Integer> ts = new HashSet<>();
    ts.add(1);
    ts.add(2);
    ts.add(3);
    ts.add(48);
    ts.add(10);
    ts.add(7);

    System.out.println(ts);
    ts.add(1);
    ts.add(1);
    ts.add(2);
    ts.add(4);
    ts.add(2);
    System.out.println(ts);

    ts.remove(2);
    System.out.println(ts.contains(2));
    System.out.println(ts.size());

  }

  static void LinkedHashSetExamples(){ // order of insertion, ll + HashTable
    LinkedHashSet<Integer> lh = new LinkedHashSet<>();
    lh.add(1);
    lh.add(2);
    lh.add(3);
    lh.add(48);
    lh.add(10);
    lh.add(7);

    System.out.println(lh);
    lh.add(1);
    lh.add(1);
    lh.add(2);
    lh.add(4);
    lh.add(2);
    System.out.println(lh);

    lh.remove(2);
    System.out.println(lh.contains(2));
    System.out.println(lh.size());

  }

  static void TreeSetExamples(){  // Sorted order, SELF BALANCING BST, REDBLOCK TREE
    TreeSet<Integer> ts = new TreeSet<>();

    ts.add(1);
    ts.add(2);
    ts.add(3);
    ts.add(48);
    ts.add(10);
    ts.add(7);

    System.out.println(ts);
    ts.add(1);
    ts.add(1);
    ts.add(2);
    ts.add(4);
    ts.add(2);
    System.out.println(ts);

    ts.remove(2);
    System.out.println(ts.contains(2));
    System.out.println(ts.size());
  }

  public static void main (String[] args){
    // HashSetExample();
    // LinkedHashSetExamples();
    TreeSetExamples();

  }
  
}
