import java.util.*;
class student{
    String name;

    int roll;
    
    float marks;
    void getdata(String n,int r,float m)
    {roll=r;
    name=n;
    marks=m;
    }
    void showdata()
    {System.out.println("name is"+name);
    System.out.println("roll number is"+roll);
    System.out.println("marks are"+marks);}
}
class mainp6
{public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
student s[]=new student[3];
for(int i=0;i<3;i++)
{s[i]=new student();
System.out.println("enter name");
String n=sc.nextLine();
System.out.println("enter roll number");
int r=sc.nextInt();
sc.nextLine();
System.out.println("enter marks");
float m=sc.nextFloat();
s[i].getdata(n,r,m);
}
System.out.println("student details are");
for(int i=0;i<3;i++)
{s[i].showdata();
System.out.println();
}
}



}