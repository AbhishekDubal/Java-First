class prime2 
{
public static void main(String[] args) 
{
int n=65;
int count=0;
for(int i=1;i<=n;i++)
{
    if(n%i==0)
    {
    count++;    
    }

} 
if(count==2)
{
System.out.println(n+"is a prime  number");
}
else 
{
    System.out.println(n+" is a not prime number");
}  
}    
}
