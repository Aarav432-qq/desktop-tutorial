import java.util.*;
class evenodd
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n[]=new int [10];
int i;
for(i=0;i<10;i++)
{System.out.println("enter a no");
n[i]=sc.nextInt();
}
System.out.println("even no are");
for(i=0;i<10;i++)
{if(n[i]%2==0)
System.out.println(n[i]);}
System.out.println("odd no are");
for(i=0;i<10;i++)
{if(n[i]%2!=0)
System.out.println(n[i]);}
}
}