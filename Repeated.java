class Repeated
{
    public static void main(String[] args) 
    {
    int[]a={10,20,10,20,30,10,40,60,10,30,10,70};
    int count=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==10)
        {
        count++;
        }

    } 
    System.out.println(count);   

    }
}
