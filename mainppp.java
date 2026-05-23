class highest
{int a,b,c;
void getdata(int a1,int b1,int c1)
{a=a1;
b=b1;
c=c1;
}
void showdata()
{if(a>b && a>c)
{System.out.println("highest is"+a);
}
else if(b>a && b>c)
{System.out.println("highest is"+b);
}
else
{System.out.println("highest is"+c);
}
}
}
class mainppp
{public static void main(String arr[])
{highest H1=new highest();
H1.getdata(10,20,30);
H1.showdata();
}}
