import java.util.jar.Attributes.Name;

class Text
{
    public void show()
    {
        ///////
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                String name=Thread.currentThread().getName();
                System.out.println("HEY you..."+name);
            }
        }
        ////////
    }
}
class A extends Thread
{
    Text t=new Text();
    A(Text t)
    {
        this.t=t;
    }
    public void run()
    {
        t.show();
    }
}
class Block_synch 
{
    public static void main(String[] args) {
        Text t=new Text();

        A t1=new A(t);
        A t2=new A(t);
        t1.setName("ABHISHEK");
        t2.setName("SHEK");
        t1.start();t2.start();
    }    
}
