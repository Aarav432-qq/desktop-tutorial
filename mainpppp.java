class student
{String n;
int rn,m;
void getdata(String n1,int rn1,int m1)
{n=n1;
rn=rn1;
m=m1;
}
void showdata()
{System.out.println("name is"+n);
System.out.println("roll number is"+rn);
System.out.println("marks is"+m);

}}
class mainpppp
{public static void main(String arr[])
{student s1=new student();
s1.getdata("aarav",101,90);
s1.showdata();

}}
