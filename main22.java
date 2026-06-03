import java.util.*;
class employee
{int salary;
void getsalary(int s)
{salary=s;
}
void showsalary()
{System.out.println("salary is"+salary);
}
}
class programmer extends employee
{int bonus;
void getbonus(int b)
{bonus=b;
}
void showbonus()
{System.out.println("bonus is"+bonus);

}

}
class main22
{public static void main(String args[])
{programmer p=new programmer();
Scanner sc=new Scanner(System.in);
System.out.println("enter salary");
int s=sc.nextInt();
System.out.println("enter bonus");

int b=sc.nextInt();
p.getsalary(s);
p.getbonus(b);
System.out.println("programmer details are");
p.showsalary();
p.showbonus();


}
}
