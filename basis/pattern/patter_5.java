package basis.pattern;
class patter_5{
  static void recerseRightT(int height){
    for (int i = 0; i <= height; i++) {
      for (int j = 0; j < height-i+1; j++) {
          System.out.print("* ");
      }System.out.println();
        
    }
  }
  public static void main(String[] args) {
      int height = 6;
      recerseRightT(height);
  }


}