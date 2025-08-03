/*
Problem Statement: Given an array of N integers. Find the elements that appear more than N/3 times in the array. If no such element exists, return an empty vector.

Pre-requisite: Majority Element(>N/2 times)

Examples

Example 1:
Input Format: N = 5, array[] = {1,2,2,3,2}
Result: 2
Explanation: Here we can see that the Count(1) = 1, Count(2) = 3 and Count(3) = 1.Therefore, the count of 2 is greater than N/3 times. Hence, 2 is the answer.

Example 2:
Input Format:  N = 6, array[] = {11,33,33,11,33,11}
Result: 11 33
Explanation: Here we can see that the Count(11) = 3 and Count(33) = 3. Therefore, the count of both 11 and 33 is greater than N/3 times. Hence, 11 and 33 is the answer.
*/

package problems.Array;
import java.util.*;


public class majorEleNby3{

  // Brute-force

  public static List<Integer> element(int arr[]){
    List<Integer> ls = new ArrayList<>();
    int n = arr.length;

    int div = n/3;
    for(int i = 0; i < n ; i++){
      int count = 0;
      if(ls.isEmpty() || ls.get(0) != arr[i]){

        for(int j = 0; j < n; j++){
          if(arr[i] == arr[j]) count++;
        }
      }

      if(count > div) ls.add(arr[i]);
      
      if(ls.size() == 2) break;
    }
    return ls;
  }

// Better (HashMap)

  public static List<Integer> majorEle(int arr[]){
    int n = arr.length;
    int div = (n/3) + 1;

    List<Integer> ls = new ArrayList<>();
    HashMap<Integer, Integer> mp = new HashMap<>();

    for(int i = 0; i < n; i++){
      int value = mp.getOrDefault(arr[i], 0);
      
      mp.put(arr[i], value + 1);
      
      if(mp.get(arr[i]) == div) ls.add(arr[i]);
      if(ls.size() == 2) break;
      
    }
    return ls;
  } 

// Optimal

  

  public static void main(String[] args) {
    int[] arr = {11,33,33,11,33,11};
    List<Integer> ans = majorEle(arr);
    System.out.print("The majority elements are: ");
    for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i) + " ");
    }
    System.out.println();
  }
}


