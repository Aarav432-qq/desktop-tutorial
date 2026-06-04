import java.util.*;
class numberformat2
{public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
try
{System.out.print("enter a no");
String s1=sc.nextLine();
System.out.print("enter another no");
String s2=sc.nextLine();
int n1=Integer.parseInt(s1);
int n2=Integer.parseInt(s2);
int sum=n1+n2;
System.out.println("sum is"+sum);
}
catch(NumberFormatException e)
{System.out.println("invalid number format");

}
finally
{System.out.println("program completed");
}
}}