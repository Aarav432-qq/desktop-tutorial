import java.util.*;
class person
{String name;
int age;
person(String n,int a)
{name=n;
age=a;

}
void showperson()
{System.out.println("name is"+name);
System.out.println("age is"+age);}

}
class student extends person
{int roll;
student(String n,int a,int r)
{super(n,a);
roll=r;
}
void showstudent()
{showperson();
System.out.println("roll number is"+roll);
}
}
class main25
{public static void main(String args[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String n=sc.nextLine();
System.out.println("enter age");
int a=sc.nextInt();
System.out.println("enter roll number");
int r=sc.nextInt();
student s=new student(n,a,r);

s.showstudent();

}
}