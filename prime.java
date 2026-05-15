import java.util.*;
class prime
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,r=2;
System.out.println("enter a no");
n=sc.nextInt();
while(r<n)
{if(n%r==0)
{System.out.println("not a prime no");
break;}
r++;
}
if(r==n)
System.out.println("it is a prime no");
}
}

