class EvenorOddarray 
{
public static void main(String[] args)
 {
int []a={1,2,3,4,5,9,7,8,6};
System.out.println("Even number in array");
for(int i=0;i<a.length;i++)
{
    if(a[i]%2==0)
    System.out.println(a[i]);
}
}
}