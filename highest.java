import java.util.*;
class highest
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter 2 no");
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
System.out.println("highest no is"+a);
else if(b>a)
System.out.println("highest no is"+b);
else
System.out.println("both no are equal");
}
}