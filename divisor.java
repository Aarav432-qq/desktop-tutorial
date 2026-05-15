import java.util.*;
class divisor
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("enter a no");
n=sc.nextInt();
for(i=1;i<=n;i++)
{if(n%i==0)
System.out.println(i);}
}
}