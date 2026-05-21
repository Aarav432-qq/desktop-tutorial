import java.util.*;
class summ
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int r,c;
System.out.print("enter no of rows");
r=sc.nextInt();
System.out.print("enter no of columns");
c=sc.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
int sum[][]=new int[r][c];
int i,j;
System.out.println("enter 1st matrix");
for(i=0;i<r;i++)
{for(j=0;j<c;j++)
{a[i][j]=sc.nextInt();
}}
System.out.println("enter 2nd matrix");
for(i=0;i<r;i++)
{for(j=0;j<c;j++)
{b[i][j]=sc.nextInt();
}}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{sum[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("sum of 2 matrices is");
for(i=0;i<r;i++)
{for(j=0;j<c;j++)
{System.out.print(sum[i][j]+"\t");}}
}
}


