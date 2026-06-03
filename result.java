import java.util.*;
class person
{String name;
void getname()
{Scanner sc=new Scanner(System.in);
name=sc.nextLine();

}}
class student extends person
{int roll;
void getrollno()
{Scanner sc=new Scanner(System.in);
System.out.println("enter roll number");
roll=sc.nextInt();

}}
class result extends student
{int marks;
void getmarks()
{Scanner sc=new Scanner(System.in);
System.out.println("enter marks");
marks=sc.nextInt();

}
void showdetails()
{System.out.println("student name is"+name);
System.out.println("student roll number is"+roll);
System.out.println("student marks are"+marks);
}
public static void main(String[] args)
{result obj=new result();
obj.getname();
obj.getrollno();
obj.getmarks();
obj.showdetails();}
}