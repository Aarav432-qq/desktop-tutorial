class employee
{String n,d;
int p,b;
void getdata(String n1,String d1,int p1)
{n=n1;  
d=d1;
p=p1;
b=p*5/100;
}
void showdata()
{System.out.println("name is"+n);
System.out.println("department is"+d);
System.out.println("salary is"+p);
System.out.println("bonus is"+b);
}}
class mainppppp
{public static void main(String arr[])
{employee e1=new employee();
e1.getdata("pankaj","computer",50000);
e1.showdata();
}}
