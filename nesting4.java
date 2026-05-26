import java.util.*;
class nesting4{
    int sum(int a,int b)
    {return a+b;
    
    }
    void result()
    {Scanner sc=new Scanner(System.in);
    System.out.println("enter a no");
    int a=sc.nextInt();
    System.out.println("enter another no");
    int b=sc.nextInt();
    int ans=sum(a,b);
    System.out.println("the sum is"+ans);}
    public static void main(String arr[])
    {nesting4 object=new nesting4();
    object.result();
    }
}