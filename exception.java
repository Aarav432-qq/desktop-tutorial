import java.util.*;
class exception
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
try{System.out.print("enter first no");
int a=sc.nextInt();
System.out.print("enter second no");
int b=sc.nextInt();
int c=a/b;
System.out.println("result is "+c);
}
catch(ArithmeticException e)
{System.out.print("cannot divide by zero");
}
finally
{System.out.print("end of program");
}
}
}