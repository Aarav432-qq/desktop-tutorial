import java.util.*;
class multiplicationmatricess
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in); 
int r1,c1,r2,c2;
System.out.print("enter no of rows of 1st matrix");
r1=sc.nextInt();
System.out.print("enter no of columns of 1st matrix");
c1=sc.nextInt();
System.out.print("enter no of rows of 2nd matrix");
r2=sc.nextInt();
System.out.print("enter no of columns of 2nd matrix");
c2=sc.nextInt();
if(c1!=r2)
{System.out.println("multiplication not possible");}
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int mul[][]=new int[r1][c2];
System.out.println("enter 1st matrix");
for(int i=0;i<r1;i++)
{for(int j=0;j<c1;j++)
{a[i][j]=sc.nextInt();
}}
System.out.println("enter 2nd matrix");
for(int i=0;i<r2;i++)
{for(int j=0;j<c2;j++)
{b[i][j]=sc.nextInt();
}
}
for(int i=0;i<r1;i++)
{for(int j=0;j<c2;j++)
{for(int k=0;k<c1;k++)
{mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
}
}
}
System.out.println("multiplication of 2 matrices is");
for(int i=0;i<r1;i++)
{for(int j=0;j<c2;j++)
{System.out.print(mul[i][j]+"\t");}}
}
}
