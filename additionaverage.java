import java.util.*;
class additionaverage
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n[]=new int[10];
int i,s=0;
for(i=0;i<10;i++)
{System.out.println("enter a no");
n[i]=sc.nextInt();
}
System.out.println("addition of no is");
for(i=0;i<10;i++)
{s=s+n[i];
System.out.println("sum"+s);

}
System.out.println("average of no is");
for(i=0;i<10;i++)
{int a=s/10;
System.out.println("average"+a);

}
}
}
