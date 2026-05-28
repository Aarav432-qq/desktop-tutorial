import java.util.*;
class student{
    int rollno;
    String name;
    double marks;
    void getData(Scanner sc)
    {System.out.println("enter roll no");
    rollno=sc.nextInt();
    sc.nextLine();
    System.out.println("enter name");
    name=sc.nextLine();
    System.out.println("enter marks");
    marks=sc.nextDouble();
    }
    void showData()
    {System.out.println("roll no is"+rollno);
    System.out.println("name is"+name);
    System.out.println("marks is"+marks);
    }
}
class array
{
public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter no of students");
int n=sc.nextInt();
student s[]=new student[n];
for(int i=0;i<n;i++)
{
System.out.println("enter details of student"+(i+1));
s[i]=new student();
s[i].getData(sc);
}
System.out.println("details of students are");
for(int i=0;i<n;i++)
{s[i].showData();
}

}


}