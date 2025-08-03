

public class BS {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
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
        }else{
          if(arr[mid] < res){
            index = mid;
            res = arr[mid];
          }
          high = mid-1;
        }
      }
      return res;
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        // int target = 5;
        System.out.println(rotateNum(arr));
      }
}