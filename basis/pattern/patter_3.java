// 1
// 12
// 123
// 1234
// 12345


package basis.pattern;
class patter_3{
  static void rightTNum(int height){
    for (int i = 1; i <= height; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }System.out.println();
    }
  }
  public static void main(String[] args) {
      int height = 6;
      rightTNum(height);
  }
}