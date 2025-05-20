package basis;
public class array {

  
  public static void main(String[] args) {

    int n = 5;
    int arr[] = {6, 4, 3, 2, 1};

    reverseArr(arr, 0, n);
    printArr(arr, n);

    //Declaration and Initialization at the same time.  
      // int[] arr2 = {1, 2, 4, 6, 8}; 

      for(int num: arr2){
        // System.out.println(num + " ");
      }

      // System.out.println(Arrays.toString(arr2));

      // int[] arr = new int[3];
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;

      for (int num : arr){
        // System.out.println(num + " ");
      }

      // System.out.println(Arrays.toString(arr));
      // arr[1] = 5;
      // System.out.println(Arrays.toString(arr));
      int[] marks = {97, 98, 95};
      int[][] finalMarks = {{97, 98, 99}, {95, 94, 96}}; // 2-D array
      // System.out.println(finalMarks[0][0]);

      // System.out.println(marks[0]);
      // Arrays.sort(marks);
      // System.out.println(marks[0]);

      // System.out.println(Arrays.deepToString(finalMarks));
  }
}
