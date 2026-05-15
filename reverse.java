import java.util.*;
class reverse
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,r=0;
System.out.println("enter a no");
n=sc.nextInt();
while(n>0)
{r=r*10+n%10;
n=n/10;}
System.out.println("the reverse of the no is "+r);
}
}
