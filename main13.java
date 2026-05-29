import java.util.*;
class student2{
    int rollno;
    String name;
student2(int r,String n)
{rollno = r;
name = n;
}
void display()
{System.out.println("roll number is"+rollno);
System.out.println("name is"+name);
}
}
class main13
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
student2[] s=new student2[3];
for(int i=0;i<s.length;i++)
{System.out.println("enter roll number and name");
int r=sc.nextInt();
sc.nextLine();
String n=sc.nextLine();
s[i]=new student2(r,n);
}
for(int i=0;i<s.length;i++)
{s[i].display();
}
}
}