import java .util.*;
class item
{int pay,quantity,amount;
String name;
item(int p,int q,String n)
{pay=p;
quantity=q;
amount=p*q;
name=n;
}
void display()
{System.out.println("name is"+name);
System.out.println("amount is"+amount);
}
}
class main14
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter pay,quantity and name");
int p=sc.nextInt();
sc.nextLine();
int q=sc.nextInt();
sc.nextLine();
String n=sc.nextLine();
item i1=new item(p,q,n);
System.out.println("item details are");
i1.display();
}

}