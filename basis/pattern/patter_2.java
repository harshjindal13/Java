// *
// **
// ***
// ****
// *****


package basis.pattern;
class patter_2{
  static void rightT(int height){
    for (int i = 0; i < height; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }System.out.println();
    }
  }
  public static void main(String[] args) {
      int height = 5;
      rightT(height);
  }
}