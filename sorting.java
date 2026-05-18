import java.util.*;
class sorting
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n[]=new int [10];
int i,j,t;
for(i=0;i<10;i++)
{System.out.println("enter a no");
n[i]=sc.nextInt();
}
for(i=0;i<10;i++)
{for(j=i+1;j<10;j++)
{if (n[i]>n[j])
{t=n[i];
n[i]=n[j];
n[j]=t;
}}}
System.out.println("sorted no are");
for(i=0;i<10;i++)
{System.out.println(n[i]);
}
}
}
