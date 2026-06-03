import java.util.*;
interface rectangle
{void area(int l,int b);
}
interface circle
{void area(double r);
}
class shape implements rectangle,circle
{public void area(int l,int b)
{System.out.println("Area of rectangle: " + (l * b));}
public void area(double r)
{System.out.println("Area of circle: " + (3.14 * r * r));}

public static void main(String args[])
{shape s=new shape();
Scanner sc=new Scanner(System.in);
System.out.println("enter length and breadth of rectangle");
int l=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter radius of circle");
double r=sc.nextDouble();
s.area(l,b);
s.area(r);
}
}
