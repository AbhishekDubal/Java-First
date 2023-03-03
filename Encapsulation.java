class A
{
    private int x;
    public void set_method(int y) 
    {
        x=y;    
    }   
    public int getm2()
    {
        return x;
    }
}
class Encapsulation
{
    public static void main(String[] args) {
        A a=new A();
        a.set_method(14);
        int copy=a.getm2();
        System.out.println(copy);
    }
}