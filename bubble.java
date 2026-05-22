import java.util.*;
class bubble
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
String names[]=new String[10];
String temp;
System.out.println("enter 10 names");
for(int i=0;i<10;i++)
{names[i]=sc.nextLine();

}
for(int i=0;i<names.length-1;i++)
{for(int j=0;j<names.length-1-i;j++)
{if(names[j].compareToIgnoreCase(names[j+1])>0)
{temp=names[j];
names[j]=names[j+1];
names[j+1]=temp;
}
}
}
System.out.println("\n names in sorted order are");
for(int i=0;i<10;i++)
{System.out.println(names[i]);
}
}
}
