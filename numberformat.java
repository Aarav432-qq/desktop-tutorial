import java.util.*;
class numberformat
{public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
try
{System.out.print("enter a no");
String num=sc.nextLine();
int n=Integer.parseInt(num);
System.out.println("number is"+n);
}
catch(NumberFormatException e)
{System.out.println("invalid number format");
}
finally
{System.out.println("program completed");
}
}}