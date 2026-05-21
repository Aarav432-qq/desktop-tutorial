import java.util.*;
class reversestring
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.print("enter a string");
String s=sc.nextLine();
String rev="";
for(int i=s.length()-1;i>=0;i--)
{rev=rev+s.charAt(i);
}
System.out.println("reversed string is"+rev);
}
}