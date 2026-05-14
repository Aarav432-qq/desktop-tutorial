import java.util.*;
class swap
{
public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter 2 no");
a=sc.nextInt();
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("swapping of 2 no a="+a+"b="+b);
}
}
