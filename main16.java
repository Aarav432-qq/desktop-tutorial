import java.util.*;
class area
{area(int side)
{int area=side*side;
System.out.println("area of square is"+area);
}
area(int l,int b)
{int area=l*b;
System.out.println("area of rectangle is"+area);

}
area(double r)
{double area=3.14*r*r;
System.out.println("area of circle is"+area);
}
}
class main16
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter side of square");
int side=sc.nextInt();
area a1=new area(side);
System.out.println("enter length and breadth of rectangle");
int l=sc.nextInt();
int b=sc.nextInt();
area a2=new area(l,b);
System.out.println("enter radius of circle");
double r=sc.nextDouble();
area a3=new area(r);
}
}