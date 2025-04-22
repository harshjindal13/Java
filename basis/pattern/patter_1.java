// ****
// ****
// ****
// ****



package basis.pattern;

// public class patter_1{
//   public static void main(String[] args) {
//     for(int i = 0; i < 4; i++){
//       for(int j = 0; j< 4; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }

class patter_1{
  static void rec(int size){

    for(int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
          System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int size = 5;  
    rec(size);
  }
}