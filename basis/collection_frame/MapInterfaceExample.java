package basis.collection_frame;
import java.util.*;

public class MapInterfaceExample {
  static void HashMapExample(){
    Map<Integer, String> mp = new HashMap<>(); 
    mp.put(3, "Aman");
    mp.put(1, "Rohan");
    mp.put(2, "Riya");
    mp.put(1, "Raj"); // over-rides
    mp.putIfAbsent(2, "Neil");

    // Instead of specifying the typeof we can use 'var'
    // Iterating over keys
    for(Integer i : mp.keySet()){
      System.out.println(i);
    }

    // Iterate over values
    for(String j : mp.values()){  // String bcz the value type is string
      System.out.println(j);
    }

    System.out.println(mp);
    System.out.println(mp.get(2));
    System.out.println(mp.containsKey(4));
    System.out.println(mp.containsValue("Riya"));
  }

  static void printFreq(int arr[]){
    int n = arr.length;
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++) {
      m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
    }
    for (var x : m.entrySet()) {
      System.out.println(x.getKey() + " " + x.getValue());
    }
    // for (Map.Entry<Integer, Integer> x : m.entrySet()) {
    //   System.out.println(x.getKey() + " " + x.getValue());
    // }
  }
  
  public static void main(String[] args) {
    int arr[] = {10, 5, 20, 5, 10, 5};

    printFreq(arr);
  }
}
