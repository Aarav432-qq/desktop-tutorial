import java.util.*;
class palandrome
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,r=0,s=0;
System.out.println("enter a no");
n=sc.nextInt();
s=n;
while(n>0)
{r=r*10+n%10;
n=n/10;}
if(s==r)
System.out.println("the no is palandrome");
else
System.out.println("the no is not palandrome");
}
}