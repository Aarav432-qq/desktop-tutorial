class employee
{String n;
void getemp()
{n="ravi";}}
class pay extends employee
{int p;
void getpay()
{p=5000;}
void showdetails()
{System.out.println("employee name"+n);
System.out.println("employee pay"+p);
}
}
class main19
{public static void main(String args[])
{pay p1=new pay();
p1.getemp();
p1.getpay();
p1.showdetails();
}
}
