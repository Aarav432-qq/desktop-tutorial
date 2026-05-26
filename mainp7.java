import java.util.*;
class employee{
    String name,department;
    int pay;
    void getdata(String n,String d,int p)
    {name=n;
    department=d;
    pay=p;
    
    }
    void showdata()
    {System.out.println("name is"+name);
    System.out.println("department is"+department);
    System.out.println("pay is"+pay);


}
}
class mainp7
{public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
employee e[]=new employee[3];   
for(int i=0;i<3;i++)
{e[i]=new employee();
System.out.println("enter name");
String n=sc.nextLine();
System.out.println("enter department");
String d=sc.nextLine();
System.out.println("enter pay");
int p=sc.nextInt();
sc.nextLine();
e[i].getdata(n,d,p);
}
System.out.println("employee details are");
for(int i=0;i<3;i++)
{e[i].showdata();
System.out.println();
}
}
}
