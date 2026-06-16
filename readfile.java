import java.io.BufferedReader;
import java.io.FileReader;
class readfile
{public static void main(String arr[])
{try
{BufferedReader br=new BufferedReader(new FileReader("prime.java"));
String line;
while((line=br.readLine())!=null)
{System.out.println(line);
}
br.close();
}
catch(Exception e)
{System.out.println("error :"+e.getMessage());
}
}
}