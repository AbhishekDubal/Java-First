 class Evenodd
  {
 public static void main(String[] args) 
 {
 int num=12345;
  int ec=0;
  int oc=0;
while(num>0) 
{
    int rem=num%10;
    if(rem%2==0)
    {
        ec++;
    }
    else
    {
        oc++;
    }
    num=num/10;
}  
System.out.println("number of even number"+ec);
System.out.println("number of odd number "+oc);
 }   
}
