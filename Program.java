class Program{
  public static void main(String []ar){
    //Reverse the String value:

    String name = "Abhishek";

    int length = name.length();

    for(int i = length-1; i>=0;i--){
      System.out.print(name.charAt(i)); 
    }
  }
}