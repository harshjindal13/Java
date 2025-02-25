package basis;

import java.util.Arrays;

public class array {
  public static void main(String[] args) {

      int[] arr = new int[3];
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;

      int[] marks = {97, 98, 95};
      int[][] finalMarks = {{97, 98, 99}, {95, 94, 96}}; // 2-D array
      // System.out.println(finalMarks[0][0]);

      System.out.println(marks[0]);
      Arrays.sort(marks);
      System.out.println(marks[0]);
  }
}
