import java.util.Scanner;
abstract class GeometricObject
{
 abstract double getPerimeter();
 abstract double getArea();
}
class Rectangle extends GeometricObject
{
    Scanner sc=new Scanner(System.in);
 // System.out.println("enter the Width");
 int W=sc.nextInt();
 // System.out.println("enter the height");
 int h=sc.nextInt();
 //System.out.println("enter the radius");
 double getPerimeter()
 {
 double peri;
 peri=2*(W+h);
 return peri;
 //System.out.println(peri);
 }
 double getArea()
 {
 double area;
 area=(W*h);
 return area;
 //System.out.println(area);
 }
 
}
class Circle extends GeometricObject
{
 Scanner sc= new Scanner(System.in);
 //double r;
 // System.out.println("Enter the radius");
int r=sc.nextInt();
double getPerimeter()
{
double P;
P=(2*3.14*r);
return P;
//System.out.println(P);
}
double getArea()
{
double A;
A=(3.14*(r*r));
return A;
// System.out.println(A);
} }
public class pra_3_1
{
public static void main(String[] args)
{
    // Scanner sc=new Scanner(System.in);
    Circle obj2=new Circle();
    Rectangle obj1=new Rectangle();
    System.out.println(obj1.getPerimeter());
    System.out.println(obj1.getArea());
    System.out.println(obj2.getPerimeter());
    System.out.println(obj2.getArea());
    if(obj1.getArea()==obj2.getArea())
    {
     System.out.println("equal");
    }
    else
    {
     System.out.println("not equal");
    }
    System.out.println("21CE140_AKSH");
    }}
