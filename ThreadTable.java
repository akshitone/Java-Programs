class Table extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i*2);
        }
    }
}
class Message extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }
}

public class ThreadTable
{
    public static void main(String args[])
    {
        Table t1=new Table();
        t1.start();
        Message t2=new Message();
        t2.start();

    }
}