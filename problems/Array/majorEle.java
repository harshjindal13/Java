/*
Example 1:
Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution. 

Example 2:
Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}

Result: 2

Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

Example 3:
Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}
 */
package problems.Array;

  public class majorEle {

    static int ele(int arr[], int n) {
      int count;
        for (int i = 0; i < n; i++) {
          count = 0;
          for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j]) {
              count++;
              
            }
          }
          if (count >= n / 2) {
            return (arr[i]);
          }
        }
        return 0;
        
    }

    static int majorityEle(int arr[], int n){
      int count = 0;
      int ele = 0;
      for (int i = 0; i < n; i++) {
        if(count == 0){
          count = 1;
          ele = arr[i];          
        }else if (ele == arr[i]) count++;
        else count--;
      }

      
      int count1 = 0;
      for (int i = 0; i < n; i++) {
        if(arr[i] == ele) count1++;

      }

      if(count1 >= n/2) return ele;
      return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 4, 2, 4, 3, 4, 4, 3, 2, 4};
        int n = nums.length;

        System.out.println(majorityEle(nums, n));
    }
}
