class Program{
  public static void main(String[] args) {
    //Right UP side corner tri-angle patterns using java.

    for (int i = 1; i <=5; i++) {
      
      for (int k = i; k > 1; k--) {
        System.out.print(" ");
      }
      for (int j = 5; j >=i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}