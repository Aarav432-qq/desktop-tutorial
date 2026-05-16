import java.util.*;
class squarecube
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n,s,c,ch;
System.out.println("enter a no");
n=sc.nextInt();
    System.out.println("enter 1 for sqaure enter 2 for cube");
    ch=sc.nextInt();
     switch (ch)
    {case 1:
    s=n*n;
    System.out.println("square"+s);
    break;
    case 2:
        c=n*n*n;
        System.out.println("cube"+c);
        break;
        default:
            System.out.println("wrong choice");
            }
}
}
