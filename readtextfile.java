
import java.io.File;
import java.util.*;
class readtextfile
{public static void main(String arr[])
{
try
{File file=new File("prime.java");
Scanner sc =new Scanner(file);
System.out.println("File contents");
while(sc.hasNextLine())
{String line=sc.nextLine();
System.out.println(line);
}
sc.close();
}catch(Exception e)
{System.out.println("error:"+e.getMessage());
}
}
}