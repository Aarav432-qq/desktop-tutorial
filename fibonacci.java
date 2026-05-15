import java.util.*;
class fibonacci
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,a=0,b=1,c;
System.out.println("enter a no");
n=sc.nextInt();
System.out.println("fibonacci series is");  
for(int i=1;i<=n;i++)
{System.out.println(a);
c=a+b;
a=b;
b=c;}
}
}   