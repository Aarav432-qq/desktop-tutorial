import java.util.*;
class sorted
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
String names[]=new String[10];
System.out.println("enter 10 names");
for(int i=0;i<10;i++)
{names[i]=sc.nextLine();
}
Arrays.sort(names);
System.out.println("\n names in sorted order are");
for(int i=0;i<10;i++)
{System.out.println(names[i]);
}
}
}
