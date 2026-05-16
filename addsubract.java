import java.util.*;
class addsubract
{public static void main(String arr[])
{Scanner sc=new Scanner (System.in);
int a,b,c,ch;
System.out.println("enter 2 no");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter 1 for add enter 2 for sub 3 for multiply 4 for divide");
ch=sc.nextInt();
switch(ch)
{case 1:
c=a+b;
System.out.println("add"+c);
break;

case 2:
    c=a-b;
    System.out.println("sub"+c);
    break;
    case 3:
        c=a*b;
        System.out.println("multiply"+c);
        break;
        case 4:
            c=a/b;
            System.out.println("divide"+c);
            break;
            default:
                System.out.println("wrong choice");
}
}
}

