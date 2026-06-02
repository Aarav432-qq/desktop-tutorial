import java.util.*;
class no
{
    no(int a, int b)
{int sum=a+b;
System.out.println("sum is"+sum);
}
no(int a,int b,int c)
{int average=(a+b+c)/3;
System.out.println("average is"+average);

}
}
class main17
{
public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
no n=new no(a,b);

no n1=new no(a,b,c);  
  


}
}