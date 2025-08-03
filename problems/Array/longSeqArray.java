/*

Example 1:
Input: [100, 200, 1, 3, 2, 4]
Output: 4
Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

Input: [3, 8, 5, 7, 6]
Output: 4
Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.

*/
package problems.Array;
import java.util.*;

public class longSeqArray {

  static int findSeq(int arr[], int n){
    int count = 1;

    //Array to list
    ArrayList<Integer> list = new ArrayList<>();
    for (int num : arr) {
        list.add(num);
    }

    //Main logic
    for (int i = 0; i < n; i++) {
      int ele = list.get(i);

      if(list.contains(ele+1)){

        if(list.contains(ele+1)){
          count++;
          ele += 1;
        }
      }

    }
    System.out.print("\n\nTotal: ");

    return count;
  }


  public static void main(String[] args) {
    int arr[] = {100, 200, 1, 3, 2, 4, 5, 6};
    int n = arr.length;

    System.out.println(findSeq(arr, n));
  }
  
}
