import java.util.*;
import java.lang.*;
abstract class Shape
{
    double a,b,c;
    abstract public double area();
    abstract public double perimeter();
}
class Square extends Shape
{
  public double area()
  {
      return a*a;
  }
  public double perimeter()
  {
      return 4*a;
  }
}
class Triangle extends Shape
{
  public double area()
  {
      return (a*b)/2;
  }
  public double perimeter()
  {
      return a+b+c;
  }
}
class Hexagon extends Shape
{
  public double area()
  {
      return (6*(a*a))/(4*Math.tan(Math.PI/6));
  }
  public double perimeter()
  {
      return 6*a;
  }
}
class Pentagon extends Shape
{
    public double area()
  {
      return (5.0/2.0)*a*b;
  }
  public double perimeter()
  {
  return 5*a;   
  }
}

public class Main
{
    public static void main(String[] args)
    {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter value of c:");
        double c = sc.nextDouble();
        
       
        Square s =  new Square();
        s.a=a;
        System.out.println("Square");
        System.out.println("Area of Square = "+ s.area());
        System.out.println("Perimeter of Square = " + s.perimeter());
        
        Triangle t = new  Triangle();
        t.a=a;
        t.b=b;
        t.c=c;
        
        System.out.println("\nTriangle");
        System.out.println("Area of Triangle = "+ t.area());
        System.out.println("Perimeter of Triangle = " + t.perimeter());
        
        
        Hexagon h =  new Hexagon();
        h.a=a;
        System.out.println("\nHexagon");
        System.out.println("Area of Hexagon = "+ h.area());
        System.out.println("Perimeter of Hexagon = " + h.perimeter());
        
        Pentagon p =  new Pentagon();
        p.a=a;
        p.b=b;
        System.out.println("\nPentagon");
        System.out.println("Area of Pentagon = "+ p.area());
        System.out.println("Perimeter of Pentagon = " + p.perimeter());
        
        sc.close();
    }
}
