/*

 Example 1:
Input:
 arr = [4, 7, 1, 0]
Output:
 7 1 0
Explanation:
 Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]
Output:
 22 12 6
Explanation:
 6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
 
 */

package problems.Array;
import java.util.*;

public class leaderArr{

  // brute
  
  // static void leader(int arr[], int n){
  //   ArrayList<Integer> l = new ArrayList<>();
  //     for (int i = 0; i < n; i++) {
  //       boolean val = true;
  //       for (int j = i+1; j < n; j++) {
  //         if(arr[j] > arr[i]) val = false;           
  //       }
  //       if(val) l.add(arr[i]);
  //     }
  //     System.out.println(l);
  // }
  
  //optimal


  static ArrayList<Integer> leader1(int arr[], int n){
    ArrayList<Integer> l = new ArrayList<>();
    int maxi = Integer.MIN_VALUE;
    for (int i = n-1; i <= 0; i--) {
      if(arr[i] > maxi){
        l.add(arr[i]);
        maxi = Math.max(maxi, arr[i]);
      }
    }
    Collections.reverse(l);
    return l;
  }
  
  public static void main(String[] args) {
    int arr[] = {10, 22, 12, 3, 0, 6};
    int n = arr.length;

    ArrayList<Integer> result = leader1(arr, n);
    // for(int x : result) System.out.println(x + " ");\
    int x = result.size();

    for (int i = 0; i < x; i++) {
      System.out.print(result.i + " ");
    }
    // System.out.println(leader1(arr, n));
  }
} 