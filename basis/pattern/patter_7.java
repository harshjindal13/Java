// star pyramid => {space, *, space}

// space = (n-i-1)
// star = ((2 * i) + 1)


package basis.pattern;
class patter_7{
  
  static void reverseNumberRightTodd(int size){
    for (int i = 0; i < size; i++) {
      //space
      for (int j = 0; j < size-i-1 ; j++) {
        System.out.print(" ");
      }
      //star  
      for (int j = 0; j < 2*i+1 ; j++) {
        System.out.print('*');
      }
      //spce
      for (int j = 0; j < size-i-1 ; j++) {
        System.out.print(" ");
      }System.out.println();
        
    }
  }
  public static void main(String[] args) {
    int size = 5;
    reverseNumberRightTodd(size);
  }
}