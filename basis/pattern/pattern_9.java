package basis.pattern;

class pattern_9{
  static void pyramid(int n){
    for (int i = 0; i < n; i++) {
      //space
      for(int j = 0; j < n-i-1; j++){
        System.out.print(' ');
      }
      // star
      for(int j = 0; j < (2*i)+1; j++){
        System.out.print('*');
      }
      //space
      for(int j = 0; j < n-i-1; j++){
        System.out.print(' ');
      }System.out.println();
        
    }
  }

  static void reversePyramid(int n){
    for (int i = 0; i < n; i++) {
      //space
      for (int j = 0; j < i; j++) {
        System.out.print(' ');
      }
      //star
      for(int j = 0; j < 2*(n-i)-1; j++){
        System.out.print('*');
      }
      //space
      for(int j = 0; j < i; j++){
        System.out.print(' ');
      }
      System.out.println();
        
    }
  }

  public static void main(String[] args) {
      int n = 5;
      pyramid(n);
      reversePyramid(n);
  }
}