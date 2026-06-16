import java.io.FileReader;
import java.io.IOException;
class readfile4
{public static void main(String arr[])
{try
{FileReader fr=new FileReader("prime.java");
int ch;
while((ch= fr.read())!=-1)
{System.out.print((char)ch);
}
fr.close();
}
catch(IOException e)
{System.out.print("lnError :"+ e.getMessage());
}
}
}