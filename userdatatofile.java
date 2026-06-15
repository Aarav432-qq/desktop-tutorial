import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class userdatatofile
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
try
{System.out.print("enter your name");
String name=sc.nextLine();
System.out.print("enter your age");
int age=sc.nextInt();
FileWriter fw=new FileWriter("userdata.txt");
fw.write("Name:"+name+ "\n");
fw.write("Age :"+age+"\n");
fw.close();
System.out.println("data saved successfully in userdata.txt");
}
catch(IOException e)
{System.out.println("error while creating filr.");}
sc.close();}}

