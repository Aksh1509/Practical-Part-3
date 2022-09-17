interface IScanner
{
    default void foram()
    {
        System.out.println("FORAM DALSANIYA");
    }
    void get();
   
}
interface IPrinter
{
    default void DEV()
    {
        System.out.println("DEV DALSANIYA");
    }
    void put();
}
class Demo implements IScanner,IPrinter
{
    void get()
    {
        System.out.println("hello foram...!!!");
    }
    void put()
    {
        System.out.println("hello dev...!!!");
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

