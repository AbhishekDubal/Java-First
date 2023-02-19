 class Specialcharecter 
 {
 public static void main(String[] args) 
 {
 String s="a?$+ String 0123456789";
 String s1="@$@ testing selenium";
 s=s.replace("^a-ZA-Z0-9","");
 System.out.println(s);
 s1=s1.replace("^a-ZA-Z0-9","");
 System.out.println("s1");   
 }   
}
