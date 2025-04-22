package basis.pattern;
class patter_6{
  
  static void reverseNumberRightT(int size){
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size-i+1 ; j++) {
        System.out.print(j + " ");
          
      }System.out.println();
        
    }
  }
  public static void main(String[] args) {
    int size = 5;
    reverseNumberRightT(size);
  }
}