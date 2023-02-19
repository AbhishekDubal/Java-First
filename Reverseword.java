 class Reverseword 
 {
 public static void main(String[] args) 
 {
 String str1="welcome to java";
 String[]words1=str1.split("\\s");
 String Reverseword1="";  
 for(String w1:words1)
 {
    StringBuilder sb=new StringBuilder(w1);
    sb.reverse();
    Reverseword1=Reverseword1+sb.toString()+" ";
 } 
 System.out.println(Reverseword1);
 }   
}
