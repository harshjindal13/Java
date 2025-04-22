// reverse star pyramid => {space, *, space}

// space = (i)
// star = (2n - (2i + 1))


package basis.pattern;
class patter_8{
  
  static void reversePyramid(int size){
    for (int i = 0; i < size; i++) {
      // space
      for (int j = 0; j < i; j++) {
          System.out.print(" ");
      }
        
      for(int j = 0; j < 2*size - (2*i + 1); j++ ){
        System.out.print('*');
      }

      for (int j = 0; j < i; j++) {
          System.out.print(" ");
      
      } System.out.println();   
    }
        
        
  }
  public static void main(String[] args) {
    int size = 5;
    reversePyramid(size);
  }
}
  