package problems.binary_search;
import java.util.*;
public class BS {

  //iterative

  static int findX(int arr[], int target){
    int n = arr.length;
    int low = 0; high = n-1;
    while(low <= high){
      int mid = (low+high)/2;
      
    }
    int index = 0;

      if(mid > target){
        for (int i = 0; i < n/2; i++) {
          if(arr[i] == target) index = i;
        }
      }else{
        for(int i = n-1; i > n/2; i--){
          if(arr[i] == target) index = i;
        }
      }

    return index;
  }


  // Recursive

  static int findVal(int arr[], int target, int mid){
    int n = arr.length;
    mid = n/2;

    if(arr[mid] > target){
      findVal(arr, target, mid)
    }
  }

  static int lower_bound(int arr[], int x){
    int n = arr.length;
    int low = 0;
    int high = n-1;
    int index = n;

    while(low <= high){
      int mid = (low+high)/2;
      if(arr[mid] >= x) {
        index = mid;
        high = mid-1;

      }else low = mid+1;
    }

    return index;
  }

  static int upper_bound(int arr[], int x){
    int n = arr.length;
    int low = 0, high = n-1;
    int index = -1;

    while(low <= high){
      int mid = (low+high)/2;
      if(arr[mid] > x){
        index = mid;
        high = mid-1;
      }else low = mid+1;
    }

    return index;

  }

  static int insert_pos(int arr[], int x){
    int n = arr.length;
    int low = 0, high = 

    return index;
  }

  static int first_occur(int arr[], int k){
    int n = arr.length;
    int low = 0, high = n-1;
    int index = -1;

    while(low <= high){
      int mid = (low+high)/2;

      if(arr[mid] == k) {
        index = mid;
        high = mid-1;
      }else if(arr[mid] > k){
        high = mid-1;
      }else low = mid+1;
    }
    return index;
  }

  static int last_occur(int arr[], int k){
    /*
    Example 1:
    Input: N = 7, target=13, array[] = {3,4,13,13,13,20,40}
    Output: 4
    Explanation: As the target value is 13 , it appears for the first time at index number 2.
     */
    int n = arr.length;    
    int low = 0, high = n-1;
    int last_index = -1;

    while(low <= high){
      int mid = (low+high)/2;

      if(arr[mid] == k){
        last_index = mid;
        low = mid+1;

      }else if(arr[mid] > k) high = mid-1;
      
      else low = mid+1;
    }

    return last_index;    
  
  }

  static int count_occur(int arr[], int k){
    int count = last_occur(arr, k)-first_occur(arr, k)+1;
  }

  static int findVal(int arr[], int k){
    int n = arr.length;
    int low = 0, high = n-1;

    while(low <= high){
      int mid = (low+high)/2;

      if(arr[mid] == k) return mid;

      if(arr[low] <= arr[mid]){
        if(arr[low] <= k && arr[mid] >= k){
          high = mid-1;

        }else{
          low = mid+1;
        }
      }else{
        if(arr[mid] <= k && arr[high] >= k){
          low = mid+1;
        }else{
          high = mid-1;
        }
      }
    }
    return -1;
  }

  public static int rotateNum(int arr[]){
    int n = arr.length;
    int low = 0, high = n-1;
    int index = -1, res = Integer.MAX_VALUE;

    while(low <= high){
      int mid = (low + high)/2;
      if(arr[low] <= arr[high]){
        if(arr[low] < res){
          index = low;
          res = arr[low];
        }
        break;
      }

      if(arr[low] <= arr[mid]){
        if(arr[low] < res){
          index = low;
          res = arr[low];
        }
        low = mid+1;
      }
      else{
        if(arr[mid] < res){
          index = mid;
          res = arr[mid];
        }
        high = mid-1;
      }
    }
    return index;
  }

    /*
    Example 1:
    Input Format: N = 5, arr[] = {1,2,3,4,5}, limit = 8
    Result: 3
    Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 
    The sum is 9(1 + 1 + 2 + 2 + 3)  if we choose 2 as a divisor. Upon dividing all the elements of the array by 3, we get 1,1,1,2,2 respectively. Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.
    */

  static int findMax(int arr[]){
    int n = arr.length, maxi = -1;
    for(int i = 0; i < n; i++){
      maxi = Math.max(maxi, arr[i]);
    }
    return maxi;
  }

  static int findDivisor(int arr[], int limit){
    int n = arr.length;
    int low = 1, high = findMax(arr);
    int divisor = -1;

    while(low <= high){
      int mid = low + (high - low) / 2;
      int sum = 0;

      for(int i = 0; i < n; i++){
        sum += Math.ceil((double)arr[i] / mid);
      }

      if(sum <= limit){
        divisor = mid; 
        high = mid - 1; 
      } else low = mid + 1; 
    }

    return divisor;
  }

  /*
  Problem Statement: You are given an array 'arr' of size 'n' which denotes the position of stalls.
  You are also given an integer 'k' which denotes the number of aggressive cows.
  You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.
  Find the maximum possible minimum distance.

  Examples

  Example 1:
  Input Format: N = 6, k = 4, arr[] = {0,3,4,7,10,9}
  Result: 3
  Explanation: The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions {0, 3, 7, 10}. Here the distances between cows are 3, 4, and 3 respectively. We cannot make the minimum distance greater than 3 in any ways.
   */

  static boolean canWePlace(int arr[], int dist, int k){
    int curCow = 1, last = arr[0];
    

  }


  /*
    Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.

    Example 1:
    Input Format: N = 3, M = 4, target = 8,
    mat[] = 
    1 2 3 4
    5 6 7 8 
    9 10 11 12
    Result: true
    Explanation: The ‘target’  = 8 exists in the 'mat' at index (1, 3).
   */

  public boolean searchMatrix(int[][] matrix, int target) {
  
    int n = matrix.length;
    int m = matrix[0].length;

    int low = 0, high = n*m-1;

    while(low <= high){
      int mid = (low + high)/2;

      int row = mid/m, col = mid%m;

      if(matrix[row][col] == target) return true;
      else if(matrix[row][col] < target) low = mid+1;
      else high = mid-1;

    }
    return false;
  }

  /*
   * Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row and each column are sorted in non-decreasing order.
    But, the first element of a row is not necessarily greater than the last element of the previous row (if it exists).
    You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.
   */

  public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    
    int row = 0, col = m-1;

    while(row < n && col > 0){
      if(matrix[row][col] == target) return true;
      else if(matrix[row][col] < target) row++;
      else col--;
    }

    return false;
  }

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int limit = 8;

    System.out.println(findDivisor(arr, limit));
  }
}
