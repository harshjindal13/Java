
package basis.pattern;
class patter_4{
  static void rightTRowNum(int height){
    for (int i = 1; i <= height; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i + " ");
        }System.out.println();
    }
  }
  public static void main(String[] args) {
      int height = 5;
      rightTRowNum(height);
  }
}