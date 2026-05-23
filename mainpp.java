class average
{int a,b,c,d;
void getdata(int a1,int b1,int c1)
{
a=a1;
b=b1;
c=c1;

}
void showdata()
{d=(a+b+c)/3;
System.out.println("average is"+d);}}
class mainpp
{public static void main(String arr[])
{average A1=new average();
A1.getdata(10,20,30);
A1.showdata();
}}

