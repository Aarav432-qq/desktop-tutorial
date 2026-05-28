import java.util.*;
class employee
{String name,department;
int pay;
void getdata(Scanner sc)
{System.out.println("enter name");
name=sc.nextLine();
System.out.println("enter department");
department=sc.nextLine();
System.out.println("enter pay");
pay=sc.nextInt();
sc.nextLine();
}
void showdata()
{System.out.println("name is"+name);
System.out.println("department is"+department);
System.out.println("pay is"+pay);
}
}
class array2
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter no of employees");
int n=sc.nextInt();
sc.nextLine();
employee e[]=new employee[n];
for(int i=0;i<n;i++)
{System.out.println("enter details of employee"+(i+1));
e[i]=new employee();
e[i].getdata(sc);
}
System.out.println("details of employees are");
for(int i=0;i<n;i++)
{
e[i].showdata();
}
}
}
