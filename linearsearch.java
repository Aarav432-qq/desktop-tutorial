import java.util.*;
class linearsearch
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
int n[]=new int [10];
int i;
for(i=0;i<10;i++)
{System.out.println("enter a no");
n[i]=sc.nextInt();
}
int item,pos=-1;
System.out.println("enter a no to search");
item=sc.nextInt();
for(i=0;i<10;i++)
{
    if(n[i]==item)
{
    pos=i;
}
}
if(pos==-1)
{System.out.println("item not found");
}
else
{
System.out.println("item found at position"+pos +1);
}
}
}




