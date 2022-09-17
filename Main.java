interface IScanner
{
    default void foram()
    {
        System.out.println("AKSH SURANI");
    }
    void get();
   
}
interface IPrinter
{
    default void DEV()
    {
        System.out.println("JYOT DELVADIYA");
    }
    void put();
}
class Demo implements IScanner,IPrinter
{
    void get()
    {
        System.out.println("hello aksh...!!!");
    }
    void put()
    {
        System.out.println("hello jyot...!!!");
    }
}
public class Main
{
public static void main(String[] args) {
//System.out.println("Hello World");
Demo d=new Demo();
d.get();
d.put();
}
}

