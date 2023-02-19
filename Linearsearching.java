class Linearsearching
 {
public static void main(String[] args) 
{
int a[] ={10,20,30,40,50};
int Search_element=50;
boolean flag=false;
for(int i=0;i<a.length;i++)
{
    System.out.println(a[i]);
    if(Search_element==a[i]);
    {
        System.out.println("element found at:"+a[i]);
        flag=true;
        break;

    }
}
if(flag==false)
{
System.out.println("element not found");
}    
}
 }
