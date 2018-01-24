class Pyramid{
    synchronized void draw_pyramid(char s){
    for(int i=0;i<10;i+=2)
    {
        for(int k=10-i;k>0;k-=2)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print(s);
        }
        System.out.println();
    }}
}
class A4 extends Thread
{
    Pyramid p;
    A4(Pyramid p)
    {
        this.p=p;
    }
    public void run()
    {
        p.draw_pyramid('*');
    }
}
class B4 extends Thread
{
    Pyramid p;
    B4(Pyramid p)
    {
        this.p=p;
    }
    public void run()
    {
        p.draw_pyramid('$');
    }
}
public class SyncTest {
    public static void main(String ard[])
    { Pyramid po=new Pyramid();
        A4 a=new A4(po);
        B4 b = new B4(po);
        a.start();
        b.start();
    }
}
