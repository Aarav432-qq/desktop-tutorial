import java.util.*;
class highestt
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter 3 no");
a=sc.nextInt();
b=sc.nextInt(); 
c=sc.nextInt();
if(a>b && a>c)
System.out.println("highestt no is"+a);
else if(b>a && b>c) 
System.out.println("highestt no is"+b);
else if(c>a && c>b)
System.out.println("highestt no is"+c);
else
System.out.println("all no are equal");
}
}