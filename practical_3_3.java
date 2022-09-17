//Aksh Surani 21ce140 CE2 C2

import java.util.*;
 interface P
{
    public void sum();
}
interface P1 extends P
{
    public void div();
}
interface P2 extends P
{
    public void sub();
}


public class Main implements P1,P2
{
     public void sum()
    {
        System.out.println("sum");
    }
    public void div()
    {
        System.out.println("div");
    }
    public void sub()
    {
        System.out.println("sub");
    }
    public void mul()
    {
        System.out.println("mul");
    }
public static void main(String[] args)
{
  Main ip=new Main();
  ip.sum();
  ip.div();
  ip.sub();
  ip.mul();
 
}
}

