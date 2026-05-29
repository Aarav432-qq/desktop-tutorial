import java.util.*;
class item
{
    int rate,quantity,amount;
    String name;
item(int r,int q,String n)
{rate=r;
quantity=q;
name=n;

}
void display()
{System.out.println("name is"+name);
amount=rate*quantity;
System.out.println("amount is"+amount);

}
}
class main15
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
item[] s=new item[3];
for(int i=0;i<s.length;i++)
{System.out.println("enter name,rate and quantity");
String n=sc.nextLine();
int r=sc.nextInt();
sc.nextLine();
int q=sc.nextInt();
sc.nextLine();
s[i]=new item(r,q,n);
}
for(int i=0;i<s.length;i++)
{s[i].display();
}
}}
