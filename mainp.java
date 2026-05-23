class rectangle
{int l,b,a;
void getdata(int l1,int b1)
{l=l1;
b=b1;
}

void showdata()
{
a=l*b;
System.out.println("area of rectangle is"+a);
}
}
class mainp
{
    public static void main(String arr[])
{
    rectangle r1=new rectangle();
r1.getdata(10,20);
r1.showdata();
}
}