package basis.collection_frame.problems;
import java.util.*;

public class trylst {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
    for(int i = 0; i < 3; i++) {
      listOfLists.add(new ArrayList<>());
    }
    
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 4; j++) {
        listOfLists.get(i).add(in.nextInt());
      }
    }
    System.out.println(listOfLists);
  }

}
  
