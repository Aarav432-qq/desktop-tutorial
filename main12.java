import java.util.*;
class employee{
    String name,department;
    int pay;
    employee(String n,String d,int p)
    {name=n;
    department=d;
    pay=p;}
    void display()
    {System.out.println("name is"+name);
    System.out.println("department is"+department);
    System.out.println("pay is"+pay);
    }
}
class main12
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String n=sc.nextLine();
System.out.println("enter department");
String d=sc.nextLine();
System.out.println("enter pay");
int p=sc.nextInt();
sc.nextLine();
employee e1=new employee(n,d,p);
System.out.println("employee details are");
}
}