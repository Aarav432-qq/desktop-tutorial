import java.io.FileInputStream;
class readfile3
{public static void main(String arr[])
{try
{FileInputStream fis=new FileInputStream("prime.java");
int ch;
while((ch=fis.read())!=-1)
{System.out.print((char)ch);
}
fis.close();
}catch(Exception e)
{System.out.println("Error :"+e);
}
}
}