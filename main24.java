import java.util.*;
class bank
{String bankname;
void getbankname(String bname)
{bankname=bname;
}
}
class account extends bank
{int accno;
void getaccno(int a, String n)
{accno=a;
bankname=n;

}
}
class transaction extends account
{double balance,deposit,withdraw;
void gettransaction(double bal, double dep, double with)    
{balance=bal;
deposit=dep;
    withdraw=with;
}
void calculate()
{balance=balance+deposit-withdraw;
}
void showdetails()
{System.out.println("bank name is"+bankname);
System.out.println("account number is"+accno);
System.out.println("balance is"+balance);
}
}
class main24
{public static void main(String args[])
{transaction t=new transaction();
Scanner sc=new Scanner(System.in);
System.out.println("enter bank name");
String bname=sc.nextLine();
System.out.println("enter account number");
int accno=sc.nextInt();
sc.nextLine();
System.out.println("enter customer name");
String cname=sc.nextLine();
System.out.println("enter balance");
double bal=sc.nextDouble();
System.out.println("enter deposit amount");
double dep=sc.nextDouble();
System.out.println("enter withdraw amount");
double with=sc.nextDouble();
t.getbankname(bname);

t.getaccno(accno,cname);
t.gettransaction(bal,dep,with);
t.calculate();
t.showdetails();
}
}
