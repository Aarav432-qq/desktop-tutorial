import java.util.*;
class patternn
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,i,j;
System.out.println("enter a no");
n=sc.nextInt();
for(i=n;i>=1;i--)
{System.out.println(" ");
for(j=i;j>=1;j--)
{System.out.print("*");}
}
}
}