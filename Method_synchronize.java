class Table
{
    public synchronized void printTable(int num) 
    {
       for (int i = 1; i <=10; i++) 
       {
        System.out.println(num*i); 
       }   
    }
}
class A extends Thread
{
    Table t =new Table();
    A(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(10);
    }
}
class B extends Thread
{
    Table t;
    B(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(4);
    }
}
class Method_synchronize 
{
    public static void main(String[] args) 
    {
        Table t=new Table();

        A a=new A(t);
        B b=new B(t);

        a.start();b.start();
    }    
}
