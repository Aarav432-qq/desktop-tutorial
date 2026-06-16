import java.io.FileReader;
import java.io.IOException;
class readfile4
{public static void main(String arr[])
{try
{FileReader fr=new FileReader("prime.java");
int ch,v=0,s=0,l=0;
while((ch= fr.read())!=-1)
{System.out.print((char)ch);
if(ch=='a' ||ch=='e'||ch=='o'||ch=='i'||ch=='u')
v++;
if (ch=='\n')
l++;
s++;


}
System.out.println("no of vowels are:"+v);
System.out.println("size of file:"+s);
System.out.println("no of line are:"+l);
fr.close();
}
catch(IOException e)
{System.out.print("lnError :"+ e.getMessage());
}



}
}