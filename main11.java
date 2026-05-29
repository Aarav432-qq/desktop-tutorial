import java.util.*;
class student2{
    int roll;
    String name;
student2(int r,String n)
{roll = r;
name = n;}
void display()
{System.out.println("roll number is"+roll);
System.out.println("name is"+name);
}
}
class main11
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.print("enter roll no");
int r=sc.nextInt();
sc.nextLine();
System.out.print("enter name");
String n=sc.nextLine();
student2 s1=new student2(r,n);
System.out.println("student details are");
s1.display();
}

}