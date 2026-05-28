class student
{int rn,m;
String n;
student()
{rn=101;
m=90;
n="aarav";
}
void showdata()
{System.out.println("name is"+n);
System.out.println("roll number is"+rn);
System.out.println("marks is"+m);
}}
class main10
{public static void main(String arr[])
{student s1=new student();
s1.showdata();
}
}