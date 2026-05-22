import java.util.*;
class names
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.print("how many names?");
int n=sc.nextInt();
sc.nextLine();
String[]name=new String[n];
System.out.println("enter names:");
for(int i=0;i<n;i++)
{
name[i]=sc.nextLine();
}
System.out.print("enter name to search");
String search=sc.nextLine();
boolean found=false;
for(int i=0;i<n;i++)
{if(name[i].equalsIgnoreCase(search))
{found=true;
break;}}
if(found){
System.out.println("name found");
}
else{System.out.println("name not found");}
}


}