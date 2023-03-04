import java.io.*;
class Filereader 
{
    public static void main(String[] args) {
        
    }   
    public static void m1()
    {
        try 
        { 
        FileReader file_ref=new FileReader("D:\\RENAME.txt");
        try {
            int i;
            while (( i=file_ref.read())!=-1) 
            {
                System.out.print((char)i);
            }
        } catch (Exception e1) 
        {
            System.out.println(e1);// TODO: handle exception
        }
        finally
        {
            file_ref.close();
        }
        } catch (Exception e) 
        {
           System.out.println(e); // TODO: handle exception
        }
    } 
}
