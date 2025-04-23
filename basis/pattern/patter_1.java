package basis.pattern;

class patter_1{
  static void rec(int size){

    for(int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
          System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void rightT(int size){
    for (int i = 0; i < size; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }System.out.println();
    }
  }
  
  static void rightTNum(int size){
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }System.out.println();
    }
  }
  
  static void rightTRowNum(int size){
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i + " ");
        }System.out.println();
    }
  }
  
  static void reverseRightT(int size){
    for (int i = 0; i <= size; i++) {
      for (int j = 0; j < size-i+1; j++) {
          System.out.print("* ");
      }System.out.println();
        
    }
  }
  
  static void reverseNumberRightTadd(int size){
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size-i+1 ; j++) {
        System.out.print(j + " ");
          
      }System.out.println();
        
    }
  }
  
  static void pyramid(int size){
    for (int i = 0; i < size; i++) {
      //space
      for(int j = 0; j < size-i-1; j++){
        System.out.print(' ');
      }
      // star
      for(int j = 0; j < (2*i)+1; j++){
        System.out.print('*');
      }
      //space
      for(int j = 0; j < size-i-1; j++){
        System.out.print(' ');
      }System.out.println();
        
    }
  }

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

    rec(size);
    System.out.println("\n");
    
    rightT(size);
    System.out.println("\n");
    
    rightTNum(size);
    System.out.println("\n");
    
    rightTRowNum(size);
    System.out.println("\n");
    
    reverseRightT(size);
    System.out.println("\n");
    
    reverseNumberRightTadd(size);
    System.out.println("\n");
    
    pyramid(size);
    System.out.println("\n");
    
    reversePyramid(size);
  }
}