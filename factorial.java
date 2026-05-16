import java.util.*;
class factorial
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,f=1,i,p,ch;
System.out.println("enter a no");
n=sc.nextInt();
System.out.println("enter 1 for factorial enter 2 for table of no");
ch=sc.nextInt();
switch(ch)
{case 1:
for(i=n;i>=1;i--)
{f=f*i;
}
System.out.println("factorial is"+f);
break;
case 2:
    for(i=1;i<=10;i++)
    {p=n*i;
    System.out.println(n+"*"+i+"="+p);
    }
    break;
default:
    System.out.println("wrong choice");
}
}
}