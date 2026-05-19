import java.util.*;
class matricess
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n[][] = new int[3][3];
int r,c;
for(r=0;r<3;r++)
{n[r]=new int[3];
for(c=0;c<3;c++)
{System.out.println("enter a no");
n[r][c]=sc.nextInt();
}
}
System.out.println("matrix is");
for(r=0;r<3;r++)
{System.out.println("\n");
for(c=0;c<3;c++)
{System.out.print(n[r][c]+"\t");
}
}
}
}


